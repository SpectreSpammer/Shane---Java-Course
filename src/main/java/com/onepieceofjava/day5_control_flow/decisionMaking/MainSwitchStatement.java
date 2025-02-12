package com.onepieceofjava.day5_control_flow.decisionMaking;

public class MainSwitchStatement {
    public static void main(String[] args) {


        int tenure = 4;

        switch (tenure){
            case 0:
            case 1:
                System.out.println("Employee Level: Trainee");
                break;
            case 2:
            case 3:
                System.out.println("Employee Level: Junior");
                break;
            case 4:
            case 5:
                System.out.println("Employee Level: Intermediate");
                break;
            case 6:
            case 7:
                System.out.println("Employee Level: Senior");
                break;
            default:
                System.out.println("Employee Level: Expert");
        }

        String dept = "pr";

        switch (dept.toLowerCase()){
            case "it":
                System.out.println("Dept is IT");
                break;

            case "hr":
                System.out.println("Dept is HR");
                break;

            case "pr":
                System.out.println("Dept is pr");
                break;

            default:
                System.out.println("Dept is Sales");
        }
    }
}
