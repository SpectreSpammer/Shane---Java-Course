package com.onepieceofjava.day4_operators.logical;

public class MainLogical {
    public static void main(String[] args) {

        int yearsOfExperience = 10;
        double salary = 40000;
        int hoursOfWork = 9;


        // equals ==
        if(yearsOfExperience > 5 || salary > 100000 ){
            System.out.println(" Shane is either a long time employee or highly paid");
        }else {
            System.out.println(" Shane is neither a long time employee or highly paid");
        }



        //&& AND - both conditions are true
        if( hoursOfWork > 9 && salary < 50000){
            System.out.println("Shane has work 9 hrs a day and his salary is less than 50k");
        }else {
            System.out.println("Shane is not working 9hrs a day and his salary is more than 50k");
        }


    }
}
