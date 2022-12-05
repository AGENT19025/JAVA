/*Java Program to Check whether the input number is a Neon Number
author : vishwas
date : 05-12-22
*/

import java.util.Scanner;

public class neonNumber{
    static boolean isneon(int a)
    {
        int x=a*a,y,sum=0;
        while(x>0)
        {
            y=x%10;
            sum=y+sum;
            x=x/10;
        }
        if(sum==a) return true;
        return false;
    }
    public static void main(String[] args)
    {
        int n;
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        if(isneon(n))
        {
            System.out.println("Given integer is neon number");
        }
        else
        {
            System.out.println("Given integer is not a neon number");
        }
        input.close();
    }
}