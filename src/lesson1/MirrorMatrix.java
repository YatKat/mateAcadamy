package lesson1;

public class MirrorMatrix {

    public static String [][] createMatrix(int width, int heigth){
        String [][] matrix = new String [width][heigth];
        for (int i = 0; i < width ; i++) {
            for (int j = 0; j < heigth; j++) {
                matrix[i][j] = "*";
            }
        }
        for (int i = 0; i < width ; i++) {
            for (int j = i; j < heigth; j++) {
                matrix[i][j] = "0";
            }
        }
        return matrix;
    }

    public static String[][] mirrorMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = "0";
            }
        }
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                matrix[i][j] = "*";
            }
        }
        return matrix;
    }

        public static void printMatrix(String[][] matrix){
            System.out.println();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j]+"  ");
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
       String [][] matrix = createMatrix(5,5);
        printMatrix(matrix);
       printMatrix(mirrorMatrix(matrix));
    }
}
