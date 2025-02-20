package com.onepieceofjava.day8_OOP.inheritance;

public class MainInheritance {
    public static void main(String[] args) {

        EmployeeInheritance regularEmployee = new EmployeeInheritance(101,"Shane", 60000.75);
        FullTImeEmployeeInheritance fte = new FullTImeEmployeeInheritance(101,"Shane", 60000.75, 30000.75);
        PartTImeEmployeeInheritance pt = new PartTImeEmployeeInheritance(101,"Shane", 60000.75, 3000.75, 6);

        System.out.println("Regular Employee");
        regularEmployee.displayEmployeeInfo();
        System.out.println();
        System.out.println("Full Time Employee");
        fte.displayEmployeeInfo();
        System.out.println();
        System.out.println("Part Time Employee");
        pt.displayEmployeeInfo();
        System.out.println();
    }
}
