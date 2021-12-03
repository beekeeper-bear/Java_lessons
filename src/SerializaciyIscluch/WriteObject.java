package SerializaciyIscluch;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        

        Person[] people = {new Person(25,"Mikle"),new Person(40,"Michail"),new Person(3,"Tom")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

        ///  oos.writeInt(people.length); 

        ///  for (Person person : people) {
         ///     oos.writeObject(person);
        //  }

        /// второй метод 
        oos.writeObject(people);



            oos.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
