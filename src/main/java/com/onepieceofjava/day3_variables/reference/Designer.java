package com.onepieceofjava.day3_variables.reference;

public class Designer implements EmployeeInterface{
    @Override
    public void lunch() {
        System.out.println("Designer is having his shortwalk");
    }

    @Override
    public void work() {
        System.out.println("Designer is doing the UI Design");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Designer is presenting the design");
    }
}
