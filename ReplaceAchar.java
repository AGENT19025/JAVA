// Replace a character at a specific index in a String in Java
// date : 08-12-22
// this code contribution by vishwas

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class ReplaceAchar{
    static String ReplaceAcharacter(String x,int a,char f)
    {
        StringBuffer r=new StringBuffer();
        for(int i=0;i<x.length();i++)
        {
            if(i==a)
            {
                r.append(f);
            }
            else
            {
                r.append(x.charAt(i));
            }
        }
        return r.toString();
    }
    public static void main(String[] args)
    {
        int n;
        String s;
        char c;
        Scanner input=new Scanner(System.in);
        s=input.nextLine();
        c=input.next().charAt(0);
        n=input.nextInt();
        System.out.println(ReplaceAcharacter(s,n,c));
        input.close();
    }
}