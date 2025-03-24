package com.onepieceofjava.day10_collection_framework.hashSet;

import com.onepieceofjava.day10_collection_framework.treeSets.EmployeeTreeSet;

import java.util.ArrayList;
import java.util.HashSet;

public class MainHashSets {
    public static void main(String[] args) {

        EmployeeServiceHashSet employeeServiceHashSet = new EmployeeServiceHashSet();


        EmployeeHashSet employee1 = new EmployeeHashSet(1,"shane","IT");
        EmployeeHashSet employee2 = new EmployeeHashSet(1,"shane","IT");
        EmployeeHashSet employee3 = new EmployeeHashSet(5,"nami","Sales");
        EmployeeHashSet employee4 = new EmployeeHashSet(2,"robin","hr");
        EmployeeHashSet employee5 = new EmployeeHashSet(3,"nan","Security");
        EmployeeHashSet employee6 = new EmployeeHashSet(4,"sanji","kitchen");
        EmployeeHashSet employee7 = new EmployeeHashSet(4,"sanji","kitchen");


        System.out.println("-----After adding of employees-----");
        System.out.println("Added employee 1: " + employeeServiceHashSet.addEmployee(employee1));
        System.out.println("Added employee 2: " + employeeServiceHashSet.addEmployee(employee2));
        System.out.println("Added employee 3: " + employeeServiceHashSet.addEmployee(employee3));
        System.out.println("Added employee 4: " + employeeServiceHashSet.addEmployee(employee4));
        System.out.println("Added employee 5: " + employeeServiceHashSet.addEmployee(employee5));
        System.out.println("Added employee 6: " + employeeServiceHashSet.addEmployee(employee6));
        System.out.println("Added employee 7: " + employeeServiceHashSet.addEmployee(employee7));
        System.out.println();

        employeeServiceHashSet.printEmployees();
        System.out.println();

        System.out.println("Total number of employees: " + employeeServiceHashSet.getTotalNoOfEmployees());
        System.out.println();


        System.out.println("-----Check if the employee is exists-----");
        System.out.println("Contains employee 1: " + employeeServiceHashSet.containsEmployee(employee1));
        System.out.println("Contains employee 2: " + employeeServiceHashSet.containsEmployee(employee2));
        System.out.println("Contains employee 3: " + employeeServiceHashSet.containsEmployee(employee3));
        System.out.println("Contains employee 4: " + employeeServiceHashSet.containsEmployee(employee4));
        System.out.println("Contains employee 5: " + employeeServiceHashSet.containsEmployee(employee5));
        System.out.println("Contains employee 6: " + employeeServiceHashSet.containsEmployee(employee6));
        System.out.println("Contains employee 7: " + employeeServiceHashSet.containsEmployee(employee7));
        System.out.println();


        System.out.println("-----Removing employee-----");
        System.out.println("Remove employee 1: " + employeeServiceHashSet.removeEmployee(employee1));
        employeeServiceHashSet.printEmployees();
        System.out.println();


        System.out.println("-----Hashcode for employee-----");
        System.out.println("Hashcode employee 1: " + employee1.hashCode());
        System.out.println("Hashcode employee 2: " + employee2.hashCode());
        System.out.println("Hashcode employee 3: " + employee3.hashCode());
        System.out.println("Hashcode employee 4: " + employee4.hashCode());
        System.out.println("Hashcode employee 5: " + employee5.hashCode());
        System.out.println("Hashcode employee 6: " + employee6.hashCode());
        System.out.println("Hashcode employee 7: " + employee7.hashCode());



    }
}
