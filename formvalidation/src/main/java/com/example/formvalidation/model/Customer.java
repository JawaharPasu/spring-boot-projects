package com.example.formvalidation.model;

import com.example.formvalidation.validation.CourseCheck;
import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName = "";

    //note: the not null throws error when applied on any primitive type
    // it has to applied on the wrapper classes
    @NotNull(message = "is required")
    @Min(value = 0, message = "the min value should be 0")
    @Max(value = 10, message = "the max value should be 10")
    private Integer freePass;

    @Pattern(regexp = "^[0-9]{6}", message="only digits of length 6 is allowed")
    private String  postalCode;

    @CourseCheck(value = "IND", message="course should start with IND")
    private String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getFreePass() {
        return freePass;
    }

    public void setFreePass(Integer freePass) {
        this.freePass = freePass;
    }

    public Customer() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
