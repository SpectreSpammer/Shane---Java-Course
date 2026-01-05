package com.onepieceofjava.day10_collection_framework.treeMap;

import com.onepieceofjava.day10_collection_framework.hashMap.EmployeeHashMap;
import com.onepieceofjava.day10_collection_framework.hashMap.EmployeeServiceHashMap;

public class MainTreeMap {
    public static void main(String[] args) {

        EmployeeServiceTreeMap employeeService = new EmployeeServiceTreeMap();


        employeeService.addEmployee(new EmployeeTreeMap(1,"shane","IT"));
        employeeService.addEmployee(new EmployeeTreeMap(3,"nan","Security"));
        employeeService.addEmployee(new EmployeeTreeMap(5,"nami","Sales"));
        employeeService.addEmployee(new EmployeeTreeMap(2,"robin","hr"));
        employeeService.addEmployee(new EmployeeTreeMap(4,"sanji","kitchen"));
        employeeService.addEmployee(new EmployeeTreeMap(1,"shane","IT"));


        System.out.println("Printing all of the employees");
        employeeService.printAllEmployees();
        System.out.println();

        System.out.println("First employee: " + employeeService.getFirstEmployee());
        System.out.println("Last employee: " + employeeService.getLastEmployee());
        int searchId = 4;
        EmployeeTreeMap emp = employeeService.getEmployeeById(searchId);
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
