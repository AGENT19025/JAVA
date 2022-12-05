/* Java Program to Find Sum of Fibonacci Series Numbers of First N Even Indexes
author : vishwas
date : 06-12-22
*/

import java.util.Scanner;

public class EvenIndexes{
    static int fib(int a)
    {
        int h1=0,h2=1,h3,sum=0;
        for(int i=2;i<=(2*a);i++)
        {
            h3=h1+h2;
            if(i%2==0) sum=sum+h3;
            h1=h2;
            h2=h3;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int n;
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        System.out.println(fib(n));
        input.close();
    }
}