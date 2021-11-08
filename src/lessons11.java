import interfaces.Person;

public class lessons11 {
    public static void main(String[] args) {

       
       /* Person person1 = new Person("Sveta");
        Animal animal = new Animal();

        person1.showInfo();

        

        animal.eat();
        animal.sleep();

        Dog dog = new Dog();

        dog.eat();
        dog.sleep();
        dog.bark();
        dog.showName();*/


     Integer x2= new Integer(123); 
        

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(cat);
        test(dog);

       

      

        
    }

   

 

    public static void test(Animal animal){

        animal.eat();
    }
}
