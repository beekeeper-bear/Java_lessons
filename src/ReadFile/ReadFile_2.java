package ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class ReadFile_2 {

    public static void main(String[] args) throws FileNotFoundException {

        String separator = File.separator;

        String path = separator + "d:" +separator + "Intel" +separator +"Instal" + separator +"OSPanel" + separator +"domains" + separator +"Project_lessons" + separator +"Project_1" +separator + "test.txt";

       // D:\Intel\Instal\OSPanel\domains\Project_lessons\Project_1
       // d:\Intel\Instal\OSPanel\domains\Project_lessons\Project_1

        File file = new File(path);

        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()) {

            System.out.println(scanner.nextLine());

        }

        scanner.close();
}

}
