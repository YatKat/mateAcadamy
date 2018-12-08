package lesson5;

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
        list.add("Bobik", 0);
        list.add("dudik", 3);
        //list.add("Robik", 12);// throw exception
        System.out.println(list.toString());
    }
}
