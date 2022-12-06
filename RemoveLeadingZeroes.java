// Remove Leading Zeros From String in Java
// date 07-12-22

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class RemoveLeadingZeroes{
    static String remove(String x)
    {
        int l=x.length();
        String y="";
        StringBuffer a=new StringBuffer(y);
        for(int i=0;i<l;i++)
        {
            char c=x.charAt(i);
            if(c!='0')
            {
                a.append(c);
            }
        }
        return a.toString();
    }
    public static void main(String[] args)
    {
        String s;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a string:");
        s=input.nextLine();
        s=remove(s);
        System.out.println("After removing zeroes from the given string:"+ s);
        input.close();
    }
}
