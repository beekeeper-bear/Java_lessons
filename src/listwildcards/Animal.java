package listwildcards;

public class Animal {

    protected int id;

    public Animal() {

        System.out.println("DOGGGGG");

    }

    public Animal(int id){
        this.id = id;

    }

    public void eat() {
        System.out.println("Animal is eating...");
    }

    public String toString() {

        return String.valueOf(id); // перевод числа в строку
    }
    
}
