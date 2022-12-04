/*Java Program to Get Input from the User
author : vishwas
date : 05/12/22
*/

import java.util.Scanner;

public class user{
    public static void main(String args[])
    {
        int a;
        String s;
        float f;
        double d;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter integer value:");
        a=input.nextInt();
        //here we used leftover method to over come the skipping of string part after a integer
        input.nextLine();
        System.out.println("Enter a string:");
        s=input.nextLine();
        System.out.println("Enter float value:");
        f=input.nextFloat();
        System.out.println("Enter double value:");
        d=input.nextDouble();
        System.out.println("given integer:"+ a);
        System.out.println("given String:"+ s);
        System.out.println("given float:"+ f);
        System.out.println("given double:"+ d);
        input.close();
    }
}
