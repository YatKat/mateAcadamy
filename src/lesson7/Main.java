package lesson7;

import java.io.FileNotFoundException;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(25, new Home());
        try {
            Field field = person.getClass().getDeclaredField("age");
            field.setAccessible(true);
            System.out.println(field.get(person));
            System.out.println(person.getClass());
            field.set(person, 36);
            System.out.println(field.get(person));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        AboutExeption ex = new AboutExeption();
        try {
            ex.print();
        }catch(NullPointerException e){
            e.printStackTrace();
        }

        try {
            ex.getFile("teztor.txt");
        }catch (FileNotFoundException e){
            try {
                throw new CustomException("No such file " ,e);
            } catch (CustomException e1) {
                e1.printStackTrace();
            }
            System.out.println("Such file not exist!");
        }
    }
}
