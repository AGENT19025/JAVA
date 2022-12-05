/*Java Program to Display All Prime Numbers from 1 to N
author : vishwas
date : 05-12-22
*/

import java.util.Scanner;

public class prime{
    static boolean isprime(int n)
    {
        if(n==1 || n==0)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args )
    {
        int n;
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(isprime(i))
            {
                System.out.println(i + " ");
            }
        }
        input.close();
    }
}