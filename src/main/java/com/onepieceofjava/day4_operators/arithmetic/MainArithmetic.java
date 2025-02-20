package com.onepieceofjava.day4_operators.arithmetic;

public class MainArithmetic {

    public static void main(String[] args) {

        double salary = 50000;
        double bonus = 25000;

        //addition +
        double grossPay = salary + bonus;
        System.out.println("Gross Pay: " + grossPay);

        //subtraction
        double witholding = 5000;
        double netPay = grossPay - witholding;
        System.out.println("Net Pay: " + netPay);

        //multiplication
        int twelveMonths = 12;
        double annualIncome = salary * twelveMonths;
        System.out.println("Annual Income: " + annualIncome);

        //division
        int yearsOfExperience = 5;
        double annualIncreaseIncome = salary / yearsOfExperience;
        System.out.println("Annual Increase per year: " + annualIncreaseIncome);


        //modulus %
        int nextPayRaise = 365 % 120;
        System.out.println("Days until your next pay raise: " + nextPayRaise);


    }
}
