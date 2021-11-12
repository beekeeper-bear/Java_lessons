package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions_2 {


    public static void main(String[] args) {

        File file = new File ("asdf");


        try {
            Scanner scanner = new Scanner(file);

            System.out.println("Не выполняется");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace(); // стандартный вывод ошибки

            System.out.println("Такого файла не существует");
        }

        // после блока try  код коректно выполняется

        System.out.println("Выполняется");
        
    }


    
}
