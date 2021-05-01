package com.mycompany.javacamp_hw3;

public class Student extends User {
    private String course;

    public Student(String name, String email, int id,String course) {
        super(name, email, id);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

