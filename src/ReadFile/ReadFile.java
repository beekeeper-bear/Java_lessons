package ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) throws FileNotFoundException { // если файл не найден

        String separator = File.separator;

        String path = separator + "d:" +separator + "Intel" +separator +"Instal" + separator +"OSPanel" + separator +"domains" + separator +"Project_lessons" + separator +"Project_1" +separator + "test_nommbers.txt";

       // D:\Intel\Instal\OSPanel\domains\Project_lessons\Project_1
       // d:\Intel\Instal\OSPanel\domains\Project_lessons\Project_1

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();

        String[] words = line.split(" "); // разбиваем строку на пробелы

        System.out.println(Arrays.toString(words));

        scanner.close();



}
      }
    
