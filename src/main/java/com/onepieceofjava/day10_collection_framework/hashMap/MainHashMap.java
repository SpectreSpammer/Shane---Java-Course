package com.onepieceofjava.day10_collection_framework.hashMap;

import com.onepieceofjava.day10_collection_framework.hashSet.EmployeeHashSet;
import com.onepieceofjava.day10_collection_framework.hashSet.EmployeeServiceHashSet;

public class MainHashMap {
    public static void main(String[] args) {

        EmployeeServiceHashMap employeeService = new EmployeeServiceHashMap();


        employeeService.addEmployee(new EmployeeHashMap(1,"shane","IT"));
        employeeService.addEmployee(new EmployeeHashMap(3,"nan","Security"));
        employeeService.addEmployee(new EmployeeHashMap(5,"nami","Sales"));
        employeeService.addEmployee(new EmployeeHashMap(2,"robin","hr"));
        employeeService.addEmployee(new EmployeeHashMap(4,"sanji","kitchen"));
        employeeService.addEmployee(new EmployeeHashMap(1,"shane","IT"));


        System.out.println("Printing all of the employees");
        employeeService.printAllEmployees();
        System.out.println();

        int searchId = 4;
        EmployeeHashMap emp = employeeService.getEmployeeById(searchId);
        System.out.println("Employee with an id: " + searchId + " : " + emp);
        System.out.println();

        System.out.println("Update employee 1");
        employeeService.updateEmployee(1,"Shaneee","Information Technology");
        employeeService.printAllEmployees();
        System.out.println();

        int removeid = 3;
        employeeService.removemployeeById(removeid);
        System.out.println("Remove Employee with an id: " + removeid );
        employeeService.printAllEmployees();
        System.out.println();

        System.out.println("Check the employee # 3");
        int checkId = 3;
        System.out.println("Does employee " + checkId + " exist? " + employeeService.hasEmployee(3));
        System.out.println();

        System.out.println("Total # of Employees: " + employeeService.totalNoOfEmployees());







    }
}
