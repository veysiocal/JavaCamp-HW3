package com.mycompany.javacamp_hw3;

public class InstructorManager {
    public void add(Instructor instructor){
        System.out.println(instructor.getName() + " is added.");
    }
    public void delete(Instructor instructor){
        System.out.println(instructor.getName() + " is deleted.");
    }
    public void showInfos(Instructor instructor){
        System.out.println("Showing Instructor Infos...");        
        System.out.println("Name: " + instructor.getName());
        System.out.println("Email: " + instructor.getEmail());
        System.out.println("Id: " + instructor.getId());
        System.out.println("Training: " + instructor.getTraining());
    }     
}
