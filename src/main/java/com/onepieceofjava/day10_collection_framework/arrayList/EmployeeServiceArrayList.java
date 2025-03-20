package com.onepieceofjava.day10_collection_framework.arrayList;

import java.util.ArrayList;

public class EmployeeServiceArrayList {

    private ArrayList<EmployeeArrayList> employeeList;

    public EmployeeServiceArrayList() {
        this.employeeList =new ArrayList<>();
    }

    //get
    public EmployeeArrayList getEmployeeByIndex(int getByIndex){
        return employeeList.get(getByIndex);
    }

    //add
    public void addEmployee(EmployeeArrayList employee){
        employeeList.add(employee);
    }

    //add employee by index
    public void addEmployeeByIndex(int index,EmployeeArrayList employee){
        employeeList.add(index,employee);
    }

    //update
    public void updateEmployeeByIndex(int index,EmployeeArrayList employee){
        employeeList.set(index,employee);
    }

    //remove
    public void removeEmployeeByIndex(int index){
        employeeList.remove(index);
    }

    //total # of employees
    public int getTotalNoOfEmployees(){
        return employeeList.size();
    }

    //is employee empty?
    public boolean isEmpty(){
        return employeeList.isEmpty();
    }

    //display employee
    public void printAllEmployees(){
        for(EmployeeArrayList emp : employeeList){
            System.out.println(emp);
        }
    }
}
