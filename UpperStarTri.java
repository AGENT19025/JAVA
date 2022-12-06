// Java Program to Print Upper Star Triangle Pattern
// date:06-12-22

import java.util.Scanner;

public class UpperStarTri{
    static void star(int a)
    {
        for(int i=0;i<=a;i++)
        {
            for(int j=1;j<=(a-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        star(n);
        input.close();
    }
}