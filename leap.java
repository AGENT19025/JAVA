/*Java Program to Check Leap Year
author : vishwas 
date : 05-12-22
*/

import java.util.Scanner;

public class leap{
    static boolean isleap(int n)
    {
        if((n%4==0 && n%100!=0) || n%400==0 )
        {
            return true ;
        }
        return false;
    }
    public static void main(String[] args)
    {
        int year;
        Scanner input =new Scanner(System.in);
        year=input.nextInt();
        if(isleap(year))
        {
            System.out.println("given year is leap");
        }
        else
        {
            System.out.println("given year is not leap");
        }
        input.close();
    }
}