package listwildcards;

import java.util.ArrayList;
import java.util.List;


public class Test {
    
  public static void main(String[] args) {
      
  List<Animal>listOfAnimal = new ArrayList<>(); 

  listOfAnimal.add(new Animal(1));
  listOfAnimal.add(new Animal(2));



  List<Dog> listOfDogs = new ArrayList<>();
  listOfDogs.add(new Dog(3));
  listOfDogs.add(new Dog(4));

  test(listOfAnimal);
  test(listOfDogs);

  }



 // private static void test(List<Animal> list) {
 // private static void test(List<?> list) {   // все методы


  private static void test(List<? extends Animal> list) {  // наследовавшие из Animal

    for(Animal animal : list) {

        System.out.println(animal);
        animal.eat();

    }
  }

  

    
}


