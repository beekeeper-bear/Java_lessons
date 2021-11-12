package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions_3 {


    public static void main(String[] args) {

       try {
        readFile();
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
       // e.printStackTrace();

       System.out.println("Обработка исключения в методе main.");
    }

    }

    public static void readFile() throws FileNotFoundException {

        File file = new File("asdf");
        Scanner scanner = new Scanner(file);
    }


    
}
