package com.student.registration.service;

import com.student.registration.dto.TeacherDto;
import com.student.registration.exception.TeacherNotFoundException;
import com.student.registration.model.Teacher;
import com.student.registration.repository.TeacherRepo;
import com.student.registration.service.teacher.TeacherCalculation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    private TeacherRepo teacherRepo;

    private TeacherCalculation teacherCalculation;

    @Autowired
    public TeacherServiceImpl(TeacherCalculation teacherCalculation) {
        this.teacherCalculation = teacherCalculation;
    }

    @Override
    public String addTeacher(Teacher teacher) {
        TeacherDto saveTeacherDto = teacherRepo.save(createTeacher(teacher));
        return saveTeacherDto.getTeacherId();
    }

    public TeacherDto createTeacher(Teacher teacher){
        return TeacherDto.builder()
                .teacherId(teacherCalculation.createTeacherId(teacher))
                .teacherFirstName(teacher.getTeacherFirstName())
                .teacherLastName(teacher.getTeacherLastName())
                .address(teacher.getAddress())
                .mobileNumber(teacher.getMobileNumber())
                .age(teacher.getAge())
                .salary(teacher.getSalary())
                .subject(teacher.getSubject())
                .build();
    }

    @Override
    public void updateTeacherData(String teacherId) {
        TeacherDto teacherRepoById = teacherRepo.getById(teacherId);

            if(ObjectUtils.isEmpty(teacherRepoById)){
            throw new TeacherNotFoundException("Teacher Not Found !");
        }
        else
            teacherRepoById.setAge(teacherRepoById.getAge());
            teacherRepoById.setMobileNumber(teacherRepoById.getMobileNumber());
    }

    @Override
    public List<TeacherDto> getTeachers() {
        List<TeacherDto> teacherRepoAll = teacherRepo.findAll();
        return teacherRepoAll;
    }

}
