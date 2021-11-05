/**
 * ClassesAndObject
 */
public class ClassesAndObject {

    public static void main(String[] args) {

        Test test = new Test(); 

       test.setAge(25);
        
       System.out.println(test.getAge());

    }
    
}

class Test {

    public String name = "Sergey";

    public int age = 53;

    public int getAge(){

        return this.age;
    }

    public void setAge(int age){

        this.age=age;
    }


    

}

class test2 {
   
}