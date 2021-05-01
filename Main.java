package com.mycompany.javacamp_hw3;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("kodlama","@io",123);
        User user2 = new User("java","@camp",456);
        UserManager userManager = new UserManager();
        userManager.add(user1);
        userManager.delete(user2);
        userManager.showInfos(user1);
        
        System.out.println("*************");
        
        Student student = new Student("Veysi","@veysi",34,"JAVA");
        StudentManager studentManager = new StudentManager();
        studentManager.add(student);
        studentManager.showInfos(student);
        
        System.out.println("*************");
        
        Instructor instructor = new Instructor("JavaCamp","EnginDemiroğ","@demiroğ",25);
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
        instructorManager.showInfos(instructor);
    }
}
