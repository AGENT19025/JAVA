// Print first letter of each word in a string using regex
// date : 08-12-22
// this code is contribution by vishwas

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class regex{
    static String check(String x)
    {
        int n=x.length();
        StringBuffer a=new StringBuffer();
        a.append(x.charAt(0));
        for(int i=0;i<n;i++)
        {
            if(x.charAt(i)==' ')
            {
                a.append(x.charAt(i+1));
            }
        }
        return a.toString();
    }
    public static void main(String[] args)
    {
        String s;
        Scanner input=new Scanner(System.in);
        s=input.nextLine();
        System.out.println("regex of given string:"+check(s));
        input.close();

    }
}