package com.student.registration.repository;

import com.student.registration.dto.TeacherDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository<TeacherDto, String> {

}
