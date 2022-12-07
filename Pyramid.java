// Java Program to Print Pyramid Number Pattern
// date : 06-12-22

import java.util.Scanner;

public class Pyramid{
    static void pyr(int x)
    {
        for(int i=1;i<=x;i++)
        {
            int a=i-1;
            for(int j=i;j<=x-1;j++)
            {
                System.out.print(" ");
                System.out.print(" ");
            }
            for(int j=0;j<=a;j++)
            {
                System.out.print((i+j)<(x*2)?(i+j)+" ":(i+j)+" ");
            }
            for(int j=1;j<=a;j++)
            {
                System.out.print((i+a-j)<2*x ?(i+a-j)+" ":(i+a-j)+" " );
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int n;
        Scanner input =new Scanner(System.in);
        n=input.nextInt();
        input.close();

    }
}