package com.onepieceofjava.day5_control_flow.decisionMaking;

public class MainIfElseStatement {
    public static void main(String[] args) {

        int yearsOfExperience = 3;
        double salary = 40000;
        int hoursOfWork = 9;
        double hourlyRate = 1000;

        // equals ==
        if(yearsOfExperience == 10){
            System.out.println(" Shane has been with the company for 10 years");
        }else {
            System.out.println(" Shane has not been with the company for 10 years");
        }

        // not equals !=
        if(salary != 50000){
            System.out.println("Shane is not 100k");
        }else {
            System.out.println("Shane salary is  50k");
        }

    }
}
