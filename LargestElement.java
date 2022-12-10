// Java Program to Find the Largest Element in an Array
// date : 09-12-22
// this code is contributed by vishwas

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class LargestElement{
    public static Scanner input=new Scanner(System.in);
    public static int [] fill(int x,int []arr)
    {
        for(int i=0;i<x;i++)
        {
            arr[i]=input.nextInt();
        }
        return arr;
    }
    public static int Largest(int x,int [] arr)
    {
        int temp=0;
        for(int i=0;i<x;i++)
        {
            if(arr[i]>temp) temp=arr[i];
        }
        return temp;
    }
    public static void main(String[] args)
    {
        int n;
        n=input.nextInt();
        int [] arr=new int[n];
        fill(n,arr);
        int res=Largest(n,arr);
        System.out.println("Largest Element in the array:"+res);
        input.close();
    }
}