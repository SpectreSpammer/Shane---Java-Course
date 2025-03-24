package com.onepieceofjava.day10_collection_framework.treeSets;

import com.onepieceofjava.day10_collection_framework.linkedList.EmployeeLinkedList;
import com.onepieceofjava.day10_collection_framework.linkedList.EmployeeServiceLinkedList;

import java.util.Comparator;

public class MainTreeSet {
    public static void main(String[] args) {
        EmployeeServiceTreeSet employees = new EmployeeServiceTreeSet();

        employees.addEmployee(new EmployeeTreeSet(1,"shane","IT"));
        employees.addEmployee(new EmployeeTreeSet(1,"shane","IT"));
        employees.addEmployee(new EmployeeTreeSet(5,"nami","Sales"));
        employees.addEmployee(new EmployeeTreeSet(2,"robin","hr"));
        employees.addEmployee(new EmployeeTreeSet(3,"nan","Security"));
        employees.addEmployee(new EmployeeTreeSet(4,"sanji","kitchen"));
        employees.addEmployee(new EmployeeTreeSet(4,"sanji","kitchen"));

        System.out.println("-----Employees sorted by Id-----");
        employees.printEmployees();
        System.out.println();
        System.out.println("First Employee:" + employees.getFirstEmployee());
        System.out.println("Last Employee:" + employees.getLastEmployee());
        System.out.println();

        EmployeeServiceTreeSet getByName = new EmployeeServiceTreeSet(
                Comparator.comparing(EmployeeTreeSet::getName)
        );
        getByName.addEmployee(new EmployeeTreeSet(1,"shane","IT"));
        getByName.addEmployee(new EmployeeTreeSet(1,"shane","IT"));
        getByName.addEmployee(new EmployeeTreeSet(5,"nami","Sales"));
        getByName.addEmployee(new EmployeeTreeSet(2,"robin","hr"));
        getByName.addEmployee(new EmployeeTreeSet(3,"nan","Security"));
        getByName.addEmployee(new EmployeeTreeSet(4,"sanji","kitchen"));
        getByName.addEmployee(new EmployeeTreeSet(4,"sanji","kitchen"));
        System.out.println("-----Employees sorted by name-----");
        getByName.printEmployees();
        System.out.println();

        EmployeeServiceTreeSet getByDept = new EmployeeServiceTreeSet(
                Comparator.comparing(EmployeeTreeSet::getDept)
        );
        getByDept.addEmployee(new EmployeeTreeSet(1,"shane","IT"));
        getByDept.addEmployee(new EmployeeTreeSet(1,"shane","IT"));
        getByDept.addEmployee(new EmployeeTreeSet(5,"nami","Sales"));
        getByDept.addEmployee(new EmployeeTreeSet(2,"robin","Hr"));
        getByDept.addEmployee(new EmployeeTreeSet(3,"nan","Security"));
        getByDept.addEmployee(new EmployeeTreeSet(4,"sanji","Kitchen"));
        getByDept.addEmployee(new EmployeeTreeSet(4,"sanji","Kitchen"));
        System.out.println("-----Employees sorted by dept-----");
        getByDept.printEmployees();
        System.out.println();

        System.out.println("-----Removing employee object-----");
        employees.removeEmployee(new EmployeeTreeSet(1,"shane","IT"));
        employees.printEmployees();


    }
}
