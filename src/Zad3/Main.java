package Zad3;

public class Main {
    public static void main(String args[]){
        int[][] matrix = new int[10][10];

        int x = 0;
        int suma = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    matrix[i][j] = x;
                    suma += x;
                    x++;
                } else matrix[i][j] = 0;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("Suma przekatnej: " + suma);
    }
}
