package com.onepieceofjava.day10_collection_framework.hashMap;

import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceHashMap {
    private HashMap<Integer,EmployeeHashMap> employeeHashMap;

    public EmployeeServiceHashMap() {
       employeeHashMap = new HashMap<>();
    }

    //add
    public EmployeeHashMap addEmployee(EmployeeHashMap addEmployee){
        return employeeHashMap.put(addEmployee.getId(),addEmployee);
    }

    //get by id
    public EmployeeHashMap getEmployeeById(int id){
        return employeeHashMap.get(id);
    }

    //remove by id
    public EmployeeHashMap removemployeeById(int id){
        return employeeHashMap.remove(id);
    }

    //update
    public void updateEmployee(int id,String name, String dept){
        if(employeeHashMap.containsKey(id)){
            employeeHashMap.put(id,new EmployeeHashMap(id,name,dept));
        }
    }

    //if employee is existing?
    public boolean hasEmployee(int id){
        return employeeHashMap.containsKey(id);
    }

    //total # of employees
    public int totalNoOfEmployees(){
        return employeeHashMap.size();
    }

    //print
    public void printAllEmployees(){
        for(Map.Entry<Integer,EmployeeHashMap> entry : employeeHashMap.entrySet()){
            System.out.println("Key: " + entry.getKey()  + " ,  Value: " + entry.getValue());
        }
    }



}
