package com.onepieceofjava.day9_exceptions.customizeException;

public class MainCustomizeException {
    public static void main(String[] args) {
        EmployeeException emp = new EmployeeException("Shane",50000.75);

        try {
            //valid
            emp.raiseSalary(10);
            System.out.println("10% raise has been completed");

            //invalid
            emp.raiseSalary(10);
            System.out.println("this line wont be printed out");

            //getters
            System.out.println("Salary " + emp.getSalary());

        } catch (InvalidRaiseException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }finally {
            System.out.println("Salary has been processed successfully.");
        }
    }




}
