package Anum;

public enum Sesons {
    SUMMER(35), WINTER(-20), AUTOM(12), SPRING(15);

    private int temperature;

    private Sesons(int temperature) {

        this.temperature = temperature; 

    }

    public int getTemperature() {

         return this.temperature;

    }
    
}
