// Swapping Pairs of Characters in a String in Java
// date:07-0=12-22

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class CT{
    static String pairof(String x)
    {
        int n=x.length();
        if(n%2!=0)
        {
            return x;
        }
        StringBuffer a=new StringBuffer();
        for(int i=0;i<n-1;i+=2)
        {
            a.append(x.charAt(i+1));
            a.append(x.charAt(i));
        }
        return a.toString();
        
    }
    public static void main(String[] args)
    {
        String s;
        Scanner input = new Scanner(System.in);
        s=input.nextLine();
        System.out.println("After reverse pairing the 2 characters:"+pairof(s));
        input.close();
    }
}