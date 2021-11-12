package Zad2;

public class Main {
    public static void main(String args[]) {
        int[] array = new int[10];
        int min = 100;
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (100 - 1)) + 1;
            System.out.print(array[i]+ " ");
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }

        System.out.println();
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
