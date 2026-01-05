package com.onepieceofjava.day11_FileIO;

import java.io.*;
import java.util.logging.Logger;

public class MainDeserialization {
    public static void main(String[] args) {

        Logger LOGGER = Logger.getLogger(MainDeserialization.class.getName());
        EmployeeIO employee = null;


        try{
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Mugiwara\\OneDrive\\Documents\\testing\\Employee Test.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            employee = (EmployeeIO) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();

            System.out.println("Deserializing Employee File.txt");
            System.out.println("First Name: " + employee.name);
            System.out.println("Address: " + employee.address);
            LOGGER.info("The file has been deserialized as Employee Test.txt");
        }  catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization");
            e.printStackTrace();
        }
    }
}
