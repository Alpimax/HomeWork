package SquareProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();
    /*
        private: only accessible in the same class
        static: access by the class name instead of needed to create an object
        Properties: we are creating an object of this class to connect a properties (test.properties) to a java object
     */

    static {

        try {
            // Creates a file object, allows us to connect to a file
            FileInputStream file = new FileInputStream("test.properties");

            // loads the files into the properties object
            properties.load(file);

        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

    }

    /*

        static block: run the code in the beginning to make sure everything is set up

        FileInputStream: connect to a file -> allows access to the information in some way
            -> checked exception occurs so we need to handle with try catch

     */




}