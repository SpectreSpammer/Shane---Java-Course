package com.onepieceofjava.day5_control_flow.loopStatement;

public class MainForEach {
    public static void main(String[] args) {

        String [] employeeNames = {"Shane","Nan","Nami","Robin"};
        double [] basesalary = { 50000,60000,70000,80000};
        int [] yearsOfService = { 5,7,3,10};

        //for loop
        for(int i = 0; i < employeeNames.length; i++){
            String name = employeeNames[i];
            double salary = basesalary[i];
            int years = yearsOfService[i];

            System.out.println(" For Loop -:" + name);
            System.out.println(" For Loop -:" + salary);
            System.out.println(" For Loop -:" + years);
        }

        System.out.println();
        //for each
        for(String name : employeeNames){
            System.out.println(" For Each - " +name);
        }



    }
}
