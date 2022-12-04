/* Java Program to Swap Two Numbers
author : vishwas
date : 05/12/22
*/

import java.util.Scanner;

public class swap{
    public static void main(String[] args)
    {
        int a,b,temp=0;
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        System.out.println("before swapped:");
        System.out.println("a="+ a);
        System.out.println("b="+ b);
        temp=b;
        b=a;
        a=temp;
        System.out.println("after swapping:");
        System.out.println("a="+ a);
        System.out.println("b="+ b);
        input.close();
    }
}