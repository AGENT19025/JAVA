/*Java Program to Check whether input character is vowel or consonant
author : vishwas
date: 05-12-22
*/

import java.util.Scanner;

public class VowelorConsonant{
    static boolean isVorC(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='u' || ch=='i' || ch=='o') return true;
        return false;
    }
    public static void main(String[] args)
    {
        char x,y;
        Scanner input = new Scanner(System.in);
        y=input.next().charAt(0);
        x=Character.toLowerCase(y);
        if(isVorC(x))
        {
            System.out.println("Given Character is Vowel");
        }
        else
        {
            System.out.println("Given Character is consonant");
        }
        input.close();
    }
}