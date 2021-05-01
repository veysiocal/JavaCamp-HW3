package com.mycompany.javacamp_hw3;

public class UserManager {
    public void add(User user){
        System.out.println(user.getName() + " is added.");
    }
    public void delete(User user){
        System.out.println(user.getName() + " is deleted.");
    }
    public void showInfos(User user){
        System.out.println("Showing User Infos...");
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Id: " + user.getId());
    }
}
