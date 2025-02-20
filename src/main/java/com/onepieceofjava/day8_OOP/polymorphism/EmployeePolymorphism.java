package com.onepieceofjava.day8_OOP.polymorphism;

public interface EmployeePolymorphism {

    int getId();
    String getName();
    double salary();
    double calculateSalary();

    default void displayEmployeeInfo(){
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Gross: " + salary());
        System.out.println("Total Salary: " + calculateSalary());
    }

}
