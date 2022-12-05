/* Java Program to Find LCM of Two Numbers
author : vishwas
date : 05-12-22
*/

import java.util.Scanner;

public class LCM_2{
    static int gcd(int a, int b)
    {
        if(a==0)
        {
            return b;
        }
        else
        {
            return gcd(b%a,a);
        }
    }
    static int lcm(int a,int b)
    {
        return (a/gcd(a,b))*b;
    }
    public static void main(String[] args)
    {
        int a,b;
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        System.out.println("LCM of "+ a + "and "+b+ " is:" +lcm(a,b));
        input.close();
    }
}