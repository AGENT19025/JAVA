// java in string palindrome 
// date : 08-12-22

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class pali{
    static void palindrome(String x)
    {
        int n=x.length();
        StringBuffer a=new StringBuffer();
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(x.charAt(i)==x.charAt(n-i-1))
            {
                cnt++;
            }
            else
            {
                System.out.println("Given string is not palindrome");
                break;
            }
            
        }
        if(n==cnt) System.out.println("Given string is palindrome");
        
    }
    public static void main(String[] args)
    {
        String s;
        Scanner input=new Scanner(System.in);
        s=input.nextLine();
        palindrome(s);
        input.close();
    }
}