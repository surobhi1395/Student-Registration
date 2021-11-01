package com.student.registration.constants;

public class StudentConstant {

    public enum Constants
    {
        DISCOUNT("10"),
        FEES_ONE_TO_FIVE("5000"),
        FEES_SIX_TO_EIGHT("8000"),
        FEES_NINE_TO_TWELVE("10000"),
        NO_FEES("0");

        public String value;

        private Constants(String value){
            this.value=value;
        }

        }



}
