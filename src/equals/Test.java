package equals;

public class Test {
    public static void main(String[] args) {
        
        Animal animal1 = new Animal(1);
        Animal animal2= new Animal(1);

       // System.out.println(animal1==animal2);  // сравниваются две ссылки объекта

        System.out.println(animal1.equals(animal2));

        String string1="Hello"; // один объект две ссылки
        String string2="Hello";

        System.out.println(string1.equals(string2));

        String a = "hello"; // два разных объекта
        String b = ("hello123".substring(0,5));

        System.out.println(b);
        System.out.println(a==b);


    }
}

class Animal {
     private int id;

     public Animal(int id) {
         this.id = id;
     }

     public boolean equals(Object obj) {

        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;

        

     }

}
  