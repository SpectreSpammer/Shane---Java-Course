package com.onepieceofjava.day10_collection_framework.hashSet;

import com.onepieceofjava.day10_collection_framework.treeSets.EmployeeTreeSet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class EmployeeServiceHashSet {
    private HashSet<EmployeeHashSet> employeeHashSets;

    public EmployeeServiceHashSet() {
        employeeHashSets = new HashSet<>();
    }



    //add
    public boolean addEmployee(EmployeeHashSet addEmployee){
        return employeeHashSets.add(addEmployee);
    }

    //delete
    public boolean removeEmployee(EmployeeHashSet removeEmployee){
        return employeeHashSets.remove(removeEmployee);
    }

    public boolean containsEmployee(EmployeeHashSet employee){
        return employeeHashSets.contains(employee);
    }

    public int getTotalNoOfEmployees(){
        return employeeHashSets.size();
    }

    //printing out
    public void printEmployees(){
        for(EmployeeHashSet emp: employeeHashSets){
            System.out.println(" - " + emp);
        }
    }
}
