package com.onepieceofjava.day10_collection_framework.treeSets;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeServiceTreeSet {
    private TreeSet<EmployeeTreeSet> employeeTreeSets;

    public EmployeeServiceTreeSet() {
        employeeTreeSets = new TreeSet<>();
    }

    public EmployeeServiceTreeSet(Comparator<EmployeeTreeSet> comparator) {
        employeeTreeSets = new TreeSet<>(comparator);
    }

    //get first
    public EmployeeTreeSet getFirstEmployee(){
        return  employeeTreeSets.getFirst();
    }

    //get last
    public EmployeeTreeSet getLastEmployee(){
        return  employeeTreeSets.getLast();
    }

    //add
    public boolean addEmployee(EmployeeTreeSet addEmployee){
        return employeeTreeSets.add(addEmployee);
    }

    //delete
    public boolean removeEmployee(EmployeeTreeSet removeEmployee){
        return employeeTreeSets.remove(removeEmployee);
    }

    //printing out
    public void printEmployees(){
        for(EmployeeTreeSet emp:  employeeTreeSets){
            System.out.println(" - " + emp);
        }
    }
}
