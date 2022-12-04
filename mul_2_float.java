/* Java Program to Multiply Two Floating-Point Numbers 
author : vishwas
date : 05/12/22
*/

import java.util.Scanner;

public class mul_2_float{
    public static void main(String[] args)
    {
        float a,b,p; // where a and b are user input float variables 
        Scanner input=new Scanner(System.in);
        a=input.nextFloat();
        b=input.nextFloat();
        p=a*b; // where p is product value of a & b
        System.out.println("product of a & b:"+ p);
        input.close(); 
    }
}