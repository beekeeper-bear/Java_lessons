package Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {

            int x = Integer.parseInt(scanner.nextLine());

            if(x !=0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    System.out.println("пользователь ввел не ноль");
                }
            }
        }
        
    }





}
