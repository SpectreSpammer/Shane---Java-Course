package com.onepieceofjava.day4_operators.comparison;

public class MainComparison {
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

        // greater than >
        if(hoursOfWork > 9){
            System.out.println("Shane is having an overtime");
        }else {
            System.out.println("Shane is not having an overtime");
        }

        // less than <
        if(hourlyRate < 1000){
            System.out.println("Shane is unpaid");
        }else {
            System.out.println("Shane is above pay");
        }

        // greater than  or equal to >=
        if(hoursOfWork >= 9){
            System.out.println("Shane is having an overtime");
        }else {
            System.out.println("Shane is not having an overtime");
        }

        // less than or equal to <=
        if(hourlyRate <= 1000){
            System.out.println("Shane is unpaid");
        }else {
            System.out.println("Shane is above pay");
        }

    }
}
