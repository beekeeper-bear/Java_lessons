/**
 * StringBulder
 */
public class StringBulder {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" brother");
        System.out.println(sb.toString());
        System.out.print(" Heloo");
        System.out.print(" Heloo");
        System.out.print(" Heloo  ");
        //System.out.printf(" Heloo, %s","Mihail"); //  строки
        System.out.printf(" Heloo, %d",55); //  цифры
        System.out.printf(" Heloo, %10d \n",55); //  цифры



    }
}