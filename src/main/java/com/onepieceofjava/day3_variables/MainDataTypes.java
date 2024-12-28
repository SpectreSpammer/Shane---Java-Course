package com.onepieceofjava.day3_variables;


public class MainDataTypes {
    public static void main(String[] args) {

        //variable type + variable name = declaration
        //8 bit
        byte age = 29;
        System.out.println("byte: " + age);

        //16 bit
        short departmentCode = 10125;
        System.out.println("short: " + departmentCode);

        //32 bit
        int id = 1234567890;
        System.out.println("int: " + id);

        float hourlyRate = 700.1234567890f;
        System.out.println("float: " + hourlyRate);
        System.out.printf(" Hourly Rate: %.2f %n", hourlyRate);

        //64 bit
        double salary = 50000.1234567890;
        System.out.println("double: " + salary);
        System.out.printf("Salary: %.2f %n", salary);

        long uuid = 1234567890123456789L;
        System.out.println("long: " + uuid);

        //boolean
        boolean isFte = false;
        System.out.println("boolean: " + isFte);

        //String
        String name = "abc123$#@#@";
        System.out.println("String: " + name);
    }
}
