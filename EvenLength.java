// Java Program to Print even length words
// date:06-12-22

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class EvenLength{
    static void check(String x)
    {
        for(String word:x.split(" "))
        {
            if(word.length()%2==0)
            {
                System.out.println(word);
            }
        }
    }
    public static void main(String[] args)
    {
        String s;
        Scanner input = new Scanner(System.in);
        s=input.nextLine();
        check(s);
        input.close();

    }
}