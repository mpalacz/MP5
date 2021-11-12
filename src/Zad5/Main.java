package Zad5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean czyPalindrom(String napis){
        for (int i = 0; i < napis.length() / 2; i ++) {
            if (napis.charAt(i) != napis.charAt(napis.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String napis = "";

        System.out.println("Wpisz napis");
        napis = br.readLine().toLowerCase();


        if (czyPalindrom(napis)) System.out.println("Wpisany napis jest palindromem");
        else System.out.println("Wpisany napis nie jest palindromem");
    }
}
