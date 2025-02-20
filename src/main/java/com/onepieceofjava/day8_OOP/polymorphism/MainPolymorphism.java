package com.onepieceofjava.day8_OOP.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class MainPolymorphism {
    public static void main(String[] args) {

        EmployeePolymorphism fte = new FullTimeEmployeePolymorphism(101,"Shane", 70000.75, 30000.75);
        EmployeePolymorphism pt = new PartTimeEmployeePolymorphism(101,"Shane", 70000.75, 25000.75, 3);
        List<String> employeeList = new ArrayList<>();

        fte.displayEmployeeInfo();
        System.out.println();
        pt.displayEmployeeInfo();
    }
}
