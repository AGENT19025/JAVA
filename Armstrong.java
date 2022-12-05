/*Java Program to Check Armstrong Number between Two Integers
author : vishwas 
date : 05-12-22
*/

import java.util.Scanner;

public class Armstrong{
    static boolean isarm(int n){
        int sum=0,temp=n,x;
        while(n>0)
        {
            x=n%10;
            sum=(x*x*x)+sum;
            n=n/10;
        }
        if(temp==sum) return true;
        return false;
    }
    public static void main(String[] args)
    {
        int first,last;
        Scanner input=new Scanner(System.in);
        first=input.nextInt();
        last=input.nextInt();
        System.out.println("Armstrongs between "+first+" and "+last+" are:");
        for(int i=first;i<=last;i++)
        {
            if(isarm(i))
            {
                System.out.println(i+" ");
            }
        }
        input.close();
    }
}