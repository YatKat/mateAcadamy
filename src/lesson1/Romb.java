package lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Romb {

    public static void createRomb(int size, int count) {
        if(size <= 0) return;
        if(count >= size){
            for (int i = 0; i < size ; i++) {
                    System.out.print("*");
            }
            size--;
        }else {
            count = size - (size-count);
            for (int i = 0; i < count; i++) {
                    System.out.print("*");
            }
        }
        count++;
        System.out.println();
        createRomb(size, count);

// варіант без рекурсії, гарно друкує ромб циклами;
//        if (size <= 0) return;
//        int center = size / 2;
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                if (i <= center) {
//                    if (j >= center - i && j <= center + i) {
//                        System.out.print("*");
//                    } else System.out.print(" ");
//                } else {
//                    if (j >= center + i - size + 1 && j <= center - i + size - 1) {
//                        System.out.print("*");
//                    } else System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
    }

    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Put the size of romb");
        try {
            int sizeOfRomb = Integer.valueOf(bf.readLine());
            createRomb(sizeOfRomb, 1);
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
