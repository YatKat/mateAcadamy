package lesson1;

public class MirrorMatrix {

    public static int [][] createMatrix(int width, int heigth){
        int [][] matrix = new int [width][heigth];
        for (int i = 0; i < width ; i++) {
            for (int j = 0; j < heigth; j++) {
                int randomNumber = (int)(Math.random()*100);
                matrix[i][j] = randomNumber;
            }
        }
        return matrix;
    }

    public static int [][] mirrorMatrix(int [][] matrix) {
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <= i; j++) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[j][i];
                        matrix[j][i] = temp;
                    }
                }
        return matrix;
    }

        public static void printMatrix(int [][] matrix){
            System.out.println();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j]+"  ");
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
       int [][] matrix = createMatrix(5,5);
        printMatrix(matrix);
       printMatrix(mirrorMatrix(matrix));
    }
}
