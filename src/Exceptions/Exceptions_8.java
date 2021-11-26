package Exceptions;

import java.io.IOException;
import java.text.ParseException;
//import java.io.IOException;
import java.util.Scanner;

public class Exceptions_8 {

    public static void main(String[] args) {

        // Checked Exception (Compile time exception) исключение во время выполнения компиляции
        // Unchecked ( Runtime exception) исключение во время выполнения программы
      try {
         
        run();

      } catch(IOException e){
          e.printStackTrace();
      }
        catch(ParseException e) {
            e.printStackTrace(); 
        }
       
    }

    


   public static void run() throws IOException, ParseException, IllegalArgumentException{

   }


}
