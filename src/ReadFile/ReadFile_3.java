package ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFile_3 {

    public static void main(String[] args) throws FileNotFoundException { // если файл не найден

        String separator = File.separator;

        String path = separator + "d:" +separator + "Intel" +separator +"Instal" + separator +"OSPanel" + separator +"domains" + separator +"Project_lessons" + separator +"Project_1" +separator + "test_nommbers.txt";

       

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();

        String[] numbersString = line.split(" "); // разбиваем строку на через пробеллы

        int[] numbers = new int[3]; // создаем массив
        int counter = 0;

        for(String number: numbersString) {
            numbers[counter++] = Integer.parseInt(number);  // переводим строку в число
        }

        System.out.println(Arrays.toString(numbers));

        scanner.close();



}
      }
    
