package com.onepieceofjava.day8_OOP.abstraction;

public class MainAbstraction {
    public static void main(String[] args) {

        EmployeeAbstraction fte = new FullTimeEmployeeAbstraction(101, "Shane", 50000.75, 25000.75);
        EmployeeAbstraction pt = new PartTimeEmployeeAbstraction(102, "Nan", 60000.75, 2500.75, 5);

        fte.displayEmployeeInfo();
        System.out.println();
        pt.displayEmployeeInfo();

    }
}
