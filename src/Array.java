public class Array {

    public static void main(String[] args) {
        
       // int[] nummbers = new int[5];

       int[] nummbers = {1,2,3,4,5};

       //String[] strings = new String[3]; 
       String[] strings = {"one","two","free"}; 

       int [] [] matrice = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};

       

       for (int i=0; i<nummbers.length; i++){
      
            nummbers[i] = i*10+2;

            System.out.println(nummbers[i]);
         
       }

       for (String string:strings){

        System.out.println(string);

       }

       System.out.println(matrice[2][2]+" ");
       System.out.println(matrice[1][1]);


    }
    
}
