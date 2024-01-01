package com.example.formvalidation.validators;

import com.example.formvalidation.validation.CourseCheck;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCheckValidator implements ConstraintValidator<CourseCheck, String> {

    private String coursePrefix;

    @Override
    public void initialize(CourseCheck courseCheck) {
        coursePrefix=courseCheck.value();
    }

    @Override
    public boolean isValid(String input, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;
        if (input!=null) {
            result=input.startsWith(coursePrefix);
        }else {
            result=true;
        }
        return result;
    }
}
