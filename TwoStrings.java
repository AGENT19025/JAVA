// Java Program to Check both the strings are same or not if same then print true or else false
// date 06-12-22

import java.util.Scanner;

public class TwoStrings{
    static boolean check(String a,String b)
    {
        if(a==b) return true;
        return false;
    }
    public static void main(String[] args)
    {
        String x,y;
        Scanner input=new Scanner(System.in);
        x=input.nextLine();
        y=input.nextLine();
        System.out.println("Given string is:"+ check(x,y));
        input.close();
    }
}