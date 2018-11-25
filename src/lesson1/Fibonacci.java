package lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

    public static int fibonacci(int deep){
        if(deep < 2) return deep;
        return fibonacci(deep-1)+ fibonacci(deep-2);
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Put the number and press enter");
        try {
            int deep = Integer.valueOf(reader.readLine());
            System.out.println("The "+ deep+ "-th fibonacci number is - "+fibonacci(deep));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
