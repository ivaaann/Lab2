package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.Scanner;

public class IsAnarchized  {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        do{
            System.out.println("Napisz tekst dla testu (0 dla wyjscia): ");
            String text = scn.nextLine();
            if(text.equals("0")) break;
            System.out.println("Wynik Anarhized: "+ StringFun.anarchize(text));
        } while (true);
    }
}