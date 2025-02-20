package com.onepieceofjava.day7_methods;

public class MainOverloading {
    public static void main(String[] args) {

        displayEmployeeInfo("Shane", 30);

        double tenureBonus = calculateSalary(70000.75, 3);
        System.out.println("Salary base on years of service: " + tenureBonus);

        System.out.println("Salary based on performance: " + calculateSalary(70000.75, "Good"));
    }

    private static double calculateSalary(double salary, int yearsOfService) {
        return salary * yearsOfService;
    }

    private static String calculateSalary(double salary, String performanceRating) {

        double bonusPercentage;

        switch (performanceRating.toLowerCase()){
            case "excellent":
                bonusPercentage = 0.1;
                break;

            case "good":
                bonusPercentage = 0.05;
                break;

            default:
                bonusPercentage = 0.03;
                performanceRating = "average";
        }

        double bonusAmount = salary * bonusPercentage;
        return  String.format("Shane get a bonus of Php .%2f, Performance Rating: %s",
                                                bonusAmount,        performanceRating);

    }

    private static void displayEmployeeInfo(String name, int age) {
        System.out.println(" - Name: " + name);
        System.out.println(" - Age: " + age);

    }
}
