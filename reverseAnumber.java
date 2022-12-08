// reversing a Number
// date: 08-12-22

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class reverseAnumber{
    static int reverse(int x)
    {
        int temp=0,a=0;
        while(x>0)
        {
            a=x%10;
            temp=temp*10+a;
            x=x/10;
        }
        return temp;
    }
    public static void main(String[] args)
    {
        int n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        System.out.println(reverse(n));
        input.close();

    }
}