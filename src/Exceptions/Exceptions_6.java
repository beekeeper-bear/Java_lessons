package Exceptions;

//import java.io.IOException;
import java.util.Scanner;

public class Exceptions_6 {

    public static void main(String[] args) throws NewException{

        Scanner scanner = new Scanner(System.in);

        while(true) {

            int x = Integer.parseInt(scanner.nextLine());

            if(x !=0) {
               
                    throw new NewException("Пользователь ввел не ноль");

               
            }
            
        }
    }





}
