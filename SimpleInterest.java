/* Java Program to Calculate Simple Interest
author : vishwas
date : 06-12-22
*/

import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args)
    {
        float P,T,R,SI;
        Scanner input = new Scanner(System.in);
        P = input.nextFloat();
        T = input.nextFloat();
        R = input.nextFloat();
        SI=(P*T*R)/100;
        System.out.println("Simple Interest:" + SI);
        input.close();
    }
}