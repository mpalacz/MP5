package Zad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a;
        String b;

        System.out.println("Wpisz pierwszy napis");
        a = br.readLine();

        System.out.println("Wpisz drugi napis");
        b = br.readLine();

        String ab = a.concat(b);
        String ba = b.concat(a);

        System.out.println(ab);
        System.out.println(ba);

        System.out.println(a.equals(b));
    }
}
