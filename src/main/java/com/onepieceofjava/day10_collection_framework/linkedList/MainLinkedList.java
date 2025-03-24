package com.onepieceofjava.day10_collection_framework.linkedList;

public class MainLinkedList {

    public static void main(String[] args) {
        EmployeeServiceLinkedList employees = new EmployeeServiceLinkedList();

        employees.addEmployee(new EmployeeLinkedList(1,"shane","IT"));
        employees.addEmployee(new EmployeeLinkedList(1,"shane","IT"));
        employees.addEmployee(new EmployeeLinkedList(5,"nami","Sales"));
        employees.addEmployee(new EmployeeLinkedList(2,"robin","hr"));
        employees.addEmployee(new EmployeeLinkedList(3,"nan","Security"));
        employees.addEmployee(new EmployeeLinkedList(4,"sanji","kitchen"));

        System.out.println("-----After adding of employees-----");
        employees.printAllEmployees();
        System.out.println();
        System.out.println("-----After adding employee in the first index-----");
        employees.addEmployeeInTheFirstIndex(new EmployeeLinkedList(6,"zoro","Developer"));
        employees.printAllEmployees();
        System.out.println();
        System.out.println("-----After adding employee in the last index-----");
        employees.addEmployeeInTheLastIndex(new EmployeeLinkedList(7,"luffy","Devops"));
        employees.printAllEmployees();
        System.out.println();
        System.out.println("-----After adding employee in the middle index-----");
        employees.addEmployeeByIndex(2,new EmployeeLinkedList(8,"brook","Musician"));
        employees.printAllEmployees();
        System.out.println();
        System.out.println("-----After updating employee in the first index-----");
        employees.updateEmployeeByIndex(3,new EmployeeLinkedList(9,"shane","Backend"));
        employees.printAllEmployees();
        System.out.println();
        System.out.println("-----After removing employee in the 2nd index-----");
        employees.removeEmployeeByIndex(1);
        employees.printAllEmployees();
        System.out.println();
        System.out.println("Total number of employees: " + employees.getTotalNoOfEmployees());
        System.out.println("Is the employee empty?: " + employees.isEmpty());
        System.out.println("Employee at index 2: " + employees.getEmployeeByIndex(2));

    }
}
