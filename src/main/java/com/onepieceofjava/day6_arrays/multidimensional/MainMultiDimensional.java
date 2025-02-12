package com.onepieceofjava.day6_arrays.multidimensional;

public class MainMultiDimensional {
    public static void main(String[] args) {


        //name, salary, hourly rate, isFullTime
        Object[][] employeeData = {
                { "Shane",50000.75, 1500, true },
                { "Nan",60000.75, 2500, false },
                { "Nami",70000.75, 3500, true },
                { "Robin",80000.75, 4500, false }

        };

        for(Object [] employees: employeeData){
            System.out.println("Name: " + employees[0]);
            System.out.println("Salary: " + employees[1]);
            System.out.println("Hourly Rate: " + employees[2]);
            System.out.println("is Full Time Employee?: " + employees[3]);
            System.out.println();

        }
    }
}
