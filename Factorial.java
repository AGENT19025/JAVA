/*Java Program to Find Factorial of a number
author : vishwas 
date : 06-12-22
*/

import java.util.Scanner;

public class Factorial{
    static int fac(int a)
    {
        int res=1;
        for(int i=1;i<=a;i++)
        {
            res=res*i;
        }
        return res;

    }
    public static void main(String[] args)
    {
        int n;
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        System.out.println(fac(n));
        input.close();
    }
}