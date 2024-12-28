package com.onepieceofjava.day3_variables.reference;

public class Manager implements EmployeeInterface{
    @Override
    public void lunch() {
        System.out.println("Manager is having his lunch");
    }

    @Override
    public void work() {
        System.out.println("Manager is facilitating the meeting");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Manager is forseeing the projects");
    }
}
