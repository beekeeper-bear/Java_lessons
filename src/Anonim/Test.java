package Anonim;

class Animal {
    public void eat(){
        System.out.println("Animal is eating..."); 
    }
}

/*class OtherAnimal extends Animal {

    public void eat(){
        System.out.println("Other animals is eating..."); // переопределяем метод
    }


}*/




public class Test {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();

       /* OtherAnimal otherAnimal = new OtherAnimal(); // переопределение
        otherAnimal.eat();*/


        Animal animal2 = new Animal(){

            public void eat(){
            System.out.println("Other animals is eating..."); // переопределяем метод
            }

        };





        animal2.eat();
        
    }
    
}


