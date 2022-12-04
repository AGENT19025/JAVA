/* Java Program to Read The Number From Standard Input 
author : vishwas 
date:04/12/22
*/

import java.util.Scanner;

public class read{
    public static void main(String[] args)
    {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer value:");
        a=input.nextInt();
        System.out.println("Given integer value:" + a);
        input.close();
        
    }
}
