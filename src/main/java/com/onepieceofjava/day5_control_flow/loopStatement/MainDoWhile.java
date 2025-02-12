package com.onepieceofjava.day5_control_flow.loopStatement;

public class MainDoWhile {
    public static void main(String[] args) {

        int trainingModule = 3;

        System.out.println("Training modules:");

        do {
//            trainingModule++;
            System.out.println("Completed Module:" + trainingModule);
            trainingModule++;
        }while (trainingModule < 5);

        System.out.println("All required modules has been completed");
    }
}
