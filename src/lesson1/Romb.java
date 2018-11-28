package lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Romb {

    public static void createRomb(int size) {
        if (size <= 0) return;
        int center = size / 2;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i <= center) {
                    if (j >= center - i && j <= center + i) {
                        System.out.print("*");
                    } else System.out.print(" ");
                } else {
                    if (j >= center + i - size + 1 && j <= center - i + size - 1) {
                        System.out.print("*");
                    } else System.out.print(" ");
                }
            }
            System.out.println();
        }
        size--;
        //createRomb(size);
    }

    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Put the size of romb");
        try {
            int sizeOfRomb = Integer.valueOf(bf.readLine());
            createRomb(sizeOfRomb);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
