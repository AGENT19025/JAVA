/* Java Program to Find the Perimeter of a Rectangle
date 06-12-22
*/

import java.util.Scanner;
public class Perimeter{
    static double peri(double x,double y)
    {
        return (2*(x+y));
    }
    public static void main(String[] args)
    {
        double a,b;
        Scanner input=new Scanner(System.in);
        a=input.nextDouble();
        b=input.nextDouble();
        System.out.println("Perimeter of Rectangle :"+ peri(a,b));
        input.close();
    }
}