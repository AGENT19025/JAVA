/* Java Program for compound interest
author : vishwas 
date : 06-12-22
*/

import java.util.Scanner;

public class CompoundInterest{
    public static void main(String[] args)
    {
        double P,R,T,CI;
        Scanner input = new Scanner(System.in);
        P=input.nextDouble();
        R=input.nextDouble();
        T=input.nextDouble();
        CI=P*(Math.pow((1+(R/100)),T));
        System.out.println("compound interest:"+CI);
        input.close();
    }
}