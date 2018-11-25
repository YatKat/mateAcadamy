package lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Romb {

    public static String[][] createRomb(int size) {
        String[][] matrix = new String[size][size];
        int center = size/2;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i <= center) {
                    if (j >= center - i && j <= center + i) {
                        matrix[i][j] = "*";
                    }else matrix[i][j] = " ";
                } else {
                    if (j >= center + i - size + 1 && j <= center - i + size - 1) {
                        matrix[i][j] = "*";
                    }else matrix[i][j] = " ";
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Put the size of romb");
        try {
            int sizeOfRomb = Integer.valueOf(bf.readLine());
            MirrorMatrix.printMatrix(createRomb(sizeOfRomb));
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
