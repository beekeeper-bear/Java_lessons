import java.util.Scanner;

/**
 * DoWhile
 */
public class DoWhile {

    
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

   /* System.out.println("Введите 5");
    int value = scanner.nextInt();

    while(value!=5) {
        System.out.println("Введите 5");
        value = scanner.nextInt();

    }
    System.out.println("Вы ввели 5"); 
}*/

int value;
do {
    System.out.println("Введи 5");
    value = scanner.nextInt();
} while(value!=5);


System.out.println("Вы ввелм 5");


    
}
}


