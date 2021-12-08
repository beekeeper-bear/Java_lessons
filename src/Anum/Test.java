package Anum;

public class Test {
    public static void main(String[] args) {

        Animal animal = Animal.CAT;

        switch(animal){

         case CAT:
         System.out.println("Its a Cat");
          break;

          case DOG:
         System.out.println("Its a Dog");
          break;

          case FROG:
         System.out.println("Its a Frog");
          break;

          default: System.out.println("No variant");


        }

        Sesons season = Sesons.SUMMER;
         
        System.out.println(season instanceof Sesons); // был ли этот обект создан от класса Sesons
        System.out.println(season.getClass()); // к какому классу пренадлежит 

        switch (season) {

            case SUMMER:
            System.err.println("Это лето "); 
            break;

            case AUTOM:
            System.err.println("Это осень "); 
            break;

            case SPRING:
            System.err.println("Это весна "); 
            break;

            case WINTER:
            System.err.println("Это зима "); 
            break;

        }

        System.out.println(animal.getTranslation());
        System.out.println(animal);
        System.out.println(season.getTemperature());
        System.out.println(animal.name()); // выводит название энама

        Animal.valueOf("CAT");

        Animal dog = Animal.valueOf("CAT");  // возращает название ENUM перевод 
        System.out.println(dog.getTranslation()); 

        System.out.println(animal.ordinal());  // вывод номера отщота ENUMA
  
       
    }
    
}
