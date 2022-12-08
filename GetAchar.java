// Java Program to get a character from a String
// date:08-12-22

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class GetAchar{
    static char GetAcharacter(String x,int a)
    {
        return x.charAt(a);
    }
    public static void main(String[] args)
    {
        int n;
        String s;
        Scanner input=new Scanner(System.in);
        s=input.nextLine();
        n=input.nextInt();
        System.out.println(GetAcharacter(s,n));
        input.close();
    }
}