package com.onepieceofjava.day3_variables.reference;

import java.util.ArrayList;
import java.util.List;

public class MainReference {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);

        // create objects
        EmployeeInterface manager = new Manager();
        EmployeeInterface developer = new Developer();
        EmployeeInterface designer = new Designer();

        EmployeeInterface[] employees = {manager, developer,designer};
        for(EmployeeInterface emp : employees){
            emp.work();
            emp.lunch();
            emp.attendMeeting();
            System.out.println();
        }



    }
}
