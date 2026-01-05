package com.onepieceofjava.day10_collection_framework.treeMap;

import com.onepieceofjava.day10_collection_framework.hashMap.EmployeeHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeServiceTreeMap {
    private TreeMap<Integer, EmployeeTreeMap> employeeTreeMap;

    public EmployeeServiceTreeMap() {
       employeeTreeMap = new TreeMap<>();
    }

    //add
    public EmployeeTreeMap addEmployee(EmployeeTreeMap addEmployee){
        return employeeTreeMap.put(addEmployee.getId(),addEmployee);
    }

    //get by id
    public EmployeeTreeMap getEmployeeById(int id){
        return employeeTreeMap.get(id);
    }

    //get first
    public EmployeeTreeMap getFirstEmployee(){
        return employeeTreeMap.firstEntry().getValue();
    }

    //get last
    public EmployeeTreeMap getLastEmployee(){
        return employeeTreeMap.lastEntry().getValue();
    }

    //remove by id
    public EmployeeTreeMap removemployeeById(int id){
        return employeeTreeMap.remove(id);
    }

    //update
    public void updateEmployee(int id,String name, String dept){
        if(employeeTreeMap.containsKey(id)){
            employeeTreeMap.put(id,new EmployeeTreeMap(id,name,dept));
        }
    }

    //if employee is existing?
    public boolean hasEmployee(int id){
        return employeeTreeMap.containsKey(id);
    }

    //total # of employees
    public int totalNoOfEmployees(){
        return employeeTreeMap.size();
    }

    //print
    public void printAllEmployees(){
        for(Map.Entry<Integer,EmployeeTreeMap> entry : employeeTreeMap.entrySet()){
            System.out.println("Key: " + entry.getKey()  + " ,  Value: " + entry.getValue());
        }
    }



}
