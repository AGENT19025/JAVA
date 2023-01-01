/* java program to Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0
date:01/01/23
this code is contributed by vishwas */
import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;
import java.util.Vector;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Stack;
public class TestCase
{
    public static Scanner input=new Scanner(System.in);
    public static int [] fill(int [] arr)
    {
        for(int i=0;i<20;i++)
        {
            arr[i]=input.nextInt();
        }
        return arr;
    }
    public static int checkpositive(int [] arr)
    {
        int res=0;
        for(int i=0;i<20;i++)
        {
            if(arr[i]>0) res++;
        }
        return res;
    }
    public static int checknegative(int [] arr)
    {
        int res=0;
        for(int i=0;i<20;i++)
        {
            if(arr[i]<0) res++;
        }
        return res;
    }
    public static int checkeven(int [] arr)
    {
        int res=0;
        for(int i=0;i<20;i++)
        {
            if(arr[i]%2==0) res++;
        }
        return res;
    }
    public static int checkodd(int [] arr)
    {
        int res=0;
        for(int i=0;i<20;i++)
        {
            if(arr[i]%2!=0) res++ ;
        }
        return res;
    }
    public static int checkzeros(int [] arr)
    {
        int res=0;
        for(int i=0;i<20;i++)
        {
            if(arr[i]==0) res++;
        }
        return res;
    }
    public static void main(String[] args)
    {
        int [] arr=new int [20];
        fill(arr);
        int positive=checkpositive(arr);
        int negative=checknegative(arr);
        int even=checkeven(arr);
        int odd=checkodd(arr);
        int zeroes=checkzeros(arr);
        System.out.println("NUMBER OF POSTIVE INTEGERS:"+positive);
        System.out.println("NUMBER OF NEGATIVE INTEGERS:"+negative);
        System.out.println("NUMBER OF EVEN INTEGERS:"+even);
        System.out.println("NUMBER OF ODD INTEGERS:"+odd);
        System.out.println("NUMBER OF ZEROES IN GIVEN ARRAY:"+zeroes);
        input.close();
    }
}
