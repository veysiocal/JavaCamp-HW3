package com.mycompany.javacamp_hw3;

public class StudentManager {
    public void add(Student student){
        System.out.println(student.getName() + " is added.");
    }
    public void delete(Student student){
        System.out.println(student.getName() + " is deleted.");
    }
    public void showInfos(Student student){
        System.out.println("Showing Student Infos...");
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Id: " + student.getId());
        System.out.println("Course: " + student.getCourse());
    } 
}
