package equals;

public class Test {
    public static void main(String[] args) {
        
        Animal animal1 = new Animal(1);
        Animal animal2= new Animal(1);

        //System.out.println(animal1==animal2);  // сравниваются две ссылки объекта

        System.out.println(animal1.equals(animal2));

    }
}

class Animal {
     private int id;

     public Animal(int id) {
         this.id = id;
     }

}
  