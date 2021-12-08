package Anum;

public enum Animal {
    CAT("кошка"), DOG("собака"), FROG("легушка");

    private String translation;

    private Animal(String translation) {

        this.translation = translation;

    }

    public String getTranslation() {

        return translation;

    }

    public String toString() {

        return "Перевод на руский язык " + translation;
    }
 

    
}
