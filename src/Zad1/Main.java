package Zad1;

public class Main {
    public static void main(String args[]){
        int[] array = new int[10];
        
        for (int i = 0; i < array.length; i++)
            array[i] = array.length - 1 - i;

        for (int j: array)
            System.out.println("element " + j + " = " + array[j]);
    }
}
