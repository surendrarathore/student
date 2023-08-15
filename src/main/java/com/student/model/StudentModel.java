package com.student.model;

public class StudentModel {
    private String firstName;
    private String lastName;
    private String city;
    private Integer rollNo;

    public  StudentModel(){}
    public StudentModel(String firstName, String lastName, String city, Integer rollNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.rollNo = rollNo;
    }

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }
}
