// Check if a given string is Pangram in Java
// date: 08-12-22
// this code is contributed by 

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class checkPangram{
    static boolean Pangram(String x)
    {
        boolean result=true;
        x=x.toLowerCase();
        for(char c='a';c<='z';c++)
        {
            if(!x.contains(String.valueOf(c)))
            {
                result=false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        String s;
        Scanner input =new Scanner(System.in);
        s=input.nextLine();
        if(Pangram(s))
        {
            System.out.println("given string is pangram");
        }
        else
        {
            System.out.println("given string is not a pangram");
        }
        input.close();
    }
}