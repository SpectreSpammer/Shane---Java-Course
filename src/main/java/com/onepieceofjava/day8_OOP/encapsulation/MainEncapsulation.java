package com.onepieceofjava.day8_OOP.encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {

        EmployeeEncapsulation employees = new EmployeeEncapsulation( 101,"Shane", 50000.75);


        //getters
        System.out.println("Id: " + employees.getId());
        System.out.println("Name: " + employees.getName());
        System.out.println("Name: " + employees.getSalary());

        System.out.println();
        //setters
        employees.setName("Nan");
        System.out.println("Name: " + employees.getName());
        employees.setSalary(80000.75);
        System.out.println("Salary: " + employees.getSalary());
        System.out.println();

        employees.setSalary(-80000.75);
        System.out.println("Invalid Salary: " + employees.getSalary());

    }
}
