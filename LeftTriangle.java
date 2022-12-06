// Java Program to Print Left Triangle Star Pattern
// date : 06-12-22

import java.util.Scanner;

public class LeftTriangle{
    static void star(int x)
    {
        for(int i=0;i<x;i++)
        {
            for(int j=2*(x-i);j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int n;
        Scanner input =new Scanner(System.in);
        n=input.nextInt();
        star(n);
        input.close();
    }
}