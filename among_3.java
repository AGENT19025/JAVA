/* Java Program to Find Largest Among 3 Numbers
author : vishwas
date 05-12-22
*/

import java.util.Scanner;

public class among_3{
    
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 3 integers value: ");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        System.out.println("largest among 3 integers :" + Math.max(Math.max(a,b),c));
        input.close();
    }
}