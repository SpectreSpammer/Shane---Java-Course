package com.onepieceofjava.day3_variables.reference;

public class Developer implements EmployeeInterface{
    @Override
    public void lunch() {
        System.out.println("Developer is having his coffee");
    }

    @Override
    public void work() {
        System.out.println("Developer is writing some code");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Developer is attending the meeting");
    }
}
