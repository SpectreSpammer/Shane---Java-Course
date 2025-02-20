package com.onepieceofjava.day8_OOP.abstraction;

public class PartTimeEmployeeAbstraction extends EmployeeAbstraction {


    private double overTimePay;
    private int workingHours;

    public PartTimeEmployeeAbstraction(int id, String name, double salary, double overTimePay, int workingHours) {
        super(id, name, salary);
        this.overTimePay = overTimePay;
        this.workingHours = workingHours;
    }

    @Override
    double calculateSalary() {
        return salary + (overTimePay * workingHours);
    }
}
