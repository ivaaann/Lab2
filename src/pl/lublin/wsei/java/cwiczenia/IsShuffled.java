package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.Scanner;

public class IsShuffled
{
    public static void main(String[] args)
    {
        Scanner scn =  new Scanner(System.in);
        do
            {
            System.out.println("Napisz tekst dla testu (spacje należy zastąpić '_'), (0 dla wyjscia): ");
            String text = scn.next();
            if(text.equals("0")) break;
            System.out.println("Wynik Shuffle: "+ StringFun.shuffle(text));
            }
        while (true);
    }
}
