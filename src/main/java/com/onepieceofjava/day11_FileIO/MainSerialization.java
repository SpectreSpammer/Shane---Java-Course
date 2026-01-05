package com.onepieceofjava.day11_FileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Logger;

public class MainSerialization {
    public static void main(String[] args) {

        Logger LOGGER = Logger.getLogger(MainSerialization.class.getName());
        EmployeeIO employee = new EmployeeIO();
        employee.name = "Shane";
        employee.address = "NCR";

        try{
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Mugiwara\\OneDrive\\Documents\\testing\\Employee Test.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Serialized data is saved as Employee Test.txt");
            LOGGER.info("The file has been created as Employee Test.txt");
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
