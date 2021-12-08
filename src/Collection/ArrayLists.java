package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {

        //ArrayList<Integer> arrayList = new ArrayList<>(); // лучше ссылать на интерфейс list
        List<Integer> arrayList = new ArrayList<>(); // лучше ссылать на интерфейс list
    

    for (int i = 0; i < 50; i++){

        arrayList.add(i); // добавить в резиновый массив
       
    }

    System.out.println(arrayList);
    System.out.println(arrayList.get(0)); // выводим первий и последний элемент
    System.out.println(arrayList.get(49));
    System.out.println(arrayList.size()); // размер массива

    for (int i = 0; i < arrayList.size(); i++) {

        System.out.println(arrayList.get(i));
    }

    for (Integer x : arrayList) {

        System.out.println(x);
    }

    arrayList.remove(10);
    System.out.println(arrayList);

    // мы проводим много удалений из нашего листа

    arrayList = new LinkedList<>(); 

}
}
