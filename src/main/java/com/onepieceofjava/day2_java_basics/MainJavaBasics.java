package com.onepieceofjava.day2_java_basics;

public class MainJavaBasics {

    public static void main(String[] args) {



        Message();

        //static - no need to create objects
        Message.sayHello();


        //without static - needs to create an object before calling the method
        Message message = new Message();
        message.sayHi();


    }

    private static void Message() {
        System.out.println("Say hello from main class");
    }
}