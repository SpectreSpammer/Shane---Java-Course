package com.onepieceofjava.day8_OOP.inheritance;

public class FullTImeEmployeeInheritance extends EmployeeInheritance{

    private double bonus;

    public FullTImeEmployeeInheritance(int id, String name, double salary,double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }


    @Override
    public double calculateSalary(){
        return super.calculateSalary() + bonus;
    }

    @Override
    public void displayEmployeeInfo(){
        super.displayEmployeeInfo();
        System.out.println("Total Salary: " + calculateSalary());
    }
}
