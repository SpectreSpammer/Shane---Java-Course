package com.onepieceofjava.day4_operators.ternary;

public class MainTernary {
    public static void main(String[] args) {

        // condition ? expression1 : expression 2

        int age = 75;
        System.out.println( age < 65 ? "not yet retired" : "retired");

        boolean isReceivedBonus = false;
        String receivedBonus =  isReceivedBonus ? "received bonus" : "not yet receiving bonus";
        System.out.println("Shane has " + receivedBonus);
    }
}
