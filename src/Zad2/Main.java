package Zad2;

public class Main {
    public static void main(String args[]){
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
            array[i] = (int)(Math.random() * (100 - 1)) + 1;

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}
