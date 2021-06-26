package pl.lublin.wsei.java.cwiczenia;
import java.util.Scanner;
import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

public class IsPalindromeTest {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        do
            {
            System.out.println("Napisz text do sprawdzenia (0 dla wyjscia): ");
            String text = scn.next();
            if(text.equals("0")) break;
            System.out.println("Tekst:"+ text + " " + (StringFun.isPalindrome(text) ?"" : "nie") + " jest palindromem");
            }
        while(true);
    }
}
