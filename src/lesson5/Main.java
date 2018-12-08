package lesson5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Barsik");
        list.add("Murzik");
        list.add("Ryzhyk");
        list.add("Lis");

        System.out.println("Size " + list.size());
        System.out.println("Contains Lis " + list.contains("Lis"));
        System.out.println("The element " + list.remove(2) + " removed");
        System.out.println("Size " + list.size());
        list.add("Zhyrik", 1);
        System.out.println(list.toString());
    }


}
