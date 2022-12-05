/* Java Program to Check Even or Odd Integers
author : k vishwas
date 05-12-22
*/

import java.util.Scanner;

public class check_E_O{
    static void check(int a)
    {
        if(a%2==0)
        {
            System.out.println("given integer is even");
        }
        else
        {
            System.out.println("given integer is odd");
        }
    }
    public static void main(String[] args)
    {
        int n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        check(n);
        input.close();
    }
}