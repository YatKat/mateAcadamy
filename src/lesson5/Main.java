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
        list.add(1, "Zhyrik");
        System.out.println(list.toString());
        list.add(0, "Bobik");
        list.add(3, "Dudik");
        //list.add("Robik", 12);// throw exception
        System.out.println(list.toString());
    }
}
