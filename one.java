// Compare two Strings in Java
// date 06-12-22

import java.util.Scanner;

public class one{
    static int check(String a,String b)
    {
        int a1=a.length();
        int a2=b.length();
        int min =Math.min(a1,a2);
        for(int i=0;i<min;i++)
        {
            int ch1=(int)a.charAt(i);
            int ch2=(int)b.charAt(i);
            if(ch1!=ch2)
            {
                return (ch1-ch2);
            }
        }
        if(a1!=a2)
        {
            return (a1-a2);
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args)
    {
        String x,y;
        Scanner input=new Scanner(System.in);
        x=input.nextLine();
        y=input.nextLine();
        System.out.println("comparing "+x+" and " +y+ ":"+ check(x,y));
        input.close();
    }
}