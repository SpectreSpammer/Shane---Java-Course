package com.onepieceofjava.day10_collection_framework.arrayList;

public class MainArrayList {
    public static void main(String[] args) {

        EmployeeServiceArrayList employees = new EmployeeServiceArrayList();

        employees.addEmployee(new EmployeeArrayList(3,"shane","IT"));
        employees.addEmployee(new EmployeeArrayList(1,"nan","security"));
        employees.addEmployee(new EmployeeArrayList(1,"nan","security"));
        employees.addEmployee(new EmployeeArrayList(2,"nami","hr"));
        employees.addEmployee(new EmployeeArrayList(5,"robin","finance"));
        employees.addEmployee(new EmployeeArrayList(4,"sanji","kitchen"));
        employees.addEmployeeByIndex(2,new EmployeeArrayList(6,"zorro","security"));

        System.out.println("After adding of employees");
        employees.printAllEmployees();
        System.out.println();
        System.out.println("------Updating emnployee------");
        employees.updateEmployeeByIndex(3,new EmployeeArrayList(7,"chopper","clinic"));
        employees.printAllEmployees();
        System.out.println();
        System.out.println("------Removing emnployee------");
        employees.removeEmployeeByIndex(3);
        employees.printAllEmployees();
        System.out.println();
        System.out.println("Total emplyoees: " + employees.getTotalNoOfEmployees());
        System.out.println();
        System.out.println("Is the emplyoee empty?: " + employees.isEmpty());
        System.out.println();
        System.out.println("Employee Index: " + employees.getEmployeeByIndex(5));

    }
}
