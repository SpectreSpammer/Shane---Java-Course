package com.onepieceofjava.day10_collection_framework.linkedList;

import java.util.LinkedList;

public class EmployeeServiceLinkedList {

    private LinkedList<EmployeeLinkedList> employeeLinkedLists;

    public EmployeeServiceLinkedList() {
        employeeLinkedLists = new LinkedList<>();
    }

    //get last employee
    public EmployeeLinkedList getLastEmployee(){
        return employeeLinkedLists.getLast();
    }

    //get first employee
    public EmployeeLinkedList getFirstEmployee(){
        return employeeLinkedLists.getFirst();
    }

    //get employee by index
    public EmployeeLinkedList getEmployeeByIndex(int employeeIndex){
        return employeeLinkedLists.get(employeeIndex);
    }

    //add employee object
    public void addEmployee(EmployeeLinkedList addEmployee){
        employeeLinkedLists.add(addEmployee);
    }

    //add employee by index
    public void addEmployeeByIndex(int employeeIndex,EmployeeLinkedList addEmployee){
        employeeLinkedLists.add(employeeIndex,addEmployee);
    }

    //add employee in the first index
    public void addEmployeeInTheFirstIndex(EmployeeLinkedList addEmployeeInFirstIndex){
        employeeLinkedLists.addFirst(addEmployeeInFirstIndex);
    }

    //add employee in the last index
    public void addEmployeeInTheLastIndex(EmployeeLinkedList addEmployeeInLastIndex){
        employeeLinkedLists.addLast(addEmployeeInLastIndex);
    }

    //update employee by index
    public void updateEmployeeByIndex(int employeeIndex,EmployeeLinkedList addEmployee){
        employeeLinkedLists.set(employeeIndex,addEmployee);
    }

    //remove employee by index
    public EmployeeLinkedList removeEmployeeByIndex(int employeeIndex){
        return employeeLinkedLists.remove(employeeIndex);
    }

   //total # of employees
    public int getTotalNoOfEmployees(){
        return employeeLinkedLists.size();
    }

    //empty
    public boolean isEmpty(){
        return employeeLinkedLists.isEmpty();
    }

    //printing out
    public void printAllEmployees(){
        for(EmployeeLinkedList emp : employeeLinkedLists){
            System.out.println(" - " + emp);
        }
    }


}
