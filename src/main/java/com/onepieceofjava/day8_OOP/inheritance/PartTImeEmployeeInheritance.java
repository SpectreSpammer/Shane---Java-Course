package com.onepieceofjava.day8_OOP.inheritance;

public class PartTImeEmployeeInheritance extends EmployeeInheritance{

    private double overTimePay;
    private int workingHours;

    public PartTImeEmployeeInheritance(int id, String name, double salary, double overTimePay,int workingHours) {
        super(id, name, salary);
        this.overTimePay = overTimePay;
        this.workingHours = workingHours;
    }


    @Override
    public double calculateSalary(){
        return super.calculateSalary() + (overTimePay * workingHours);
    }

    @Override
    public void displayEmployeeInfo(){
        super.displayEmployeeInfo();
        System.out.println("OverTimePay: " + overTimePay);
        System.out.println("Working Hours : " + workingHours);
    }
}
