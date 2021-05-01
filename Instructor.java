package com.mycompany.javacamp_hw3;

public class Instructor extends User{
    private String training;

    public Instructor(String training, String name, String email, int id) {
        super(name, email, id);
        this.training = training;
    }

    public String getTraining() {
        return training;
    }

    public void setTraining(String training) {
        this.training = training;
    }
}
