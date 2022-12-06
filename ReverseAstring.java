// Reverse a string in Java
// date : 07-12-22

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class ReverseAstring{
    static String reverse(String x)
    {
        int l=x.length();
        String y="";
        StringBuffer a=new StringBuffer(y);
        for(int i=l-1;i>=0;i--)
        {
            char c=x.charAt(i);
            a.append(c);
        }
        return a.toString();
    }
    public static void main(String[] args)
    {
        String s;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string:");
        s=input.nextLine();
        s=reverse(s);
        System.out.println("After reversing the string:"+s);
        input.close();
    }
}