package Anonim2;


interface AbleToEat{
    public void eat();
}

/*class Animal implements AbleToEat {

    

    public void eat(){
        System.out.println("dvsdvs");
    }

}*/

public class Test {

    public static void main(String[] args) {


     AbleToEat ableToEat = new AbleToEat() {


  public void eat(){
        System.out.println("Someone is eating...");
    }

     };   

     /*Animal animal = new Animal();

     animal.eat();*/


  

  ableToEat.eat();


        
    }
    
}
