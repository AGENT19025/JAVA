// Java Program to Sort an Array
// date: 09-12-22
// this code is contributed by vishwas 

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class SortArray{
    public static Scanner input = new Scanner(System.in);
    static int[] fill(int x,int[]arr){
        for(int i=0;i<x;i++)
        {
            arr[i]=input.nextInt();
        }
        return arr;
    }
    static int[] Sorted(int x,int []arr)
    {
        int temp=0;
        for(int i=0;i<x;i++)
        {
            for(int j=i+1;j<x;j++)
            {
                if(arr[j]<arr[i])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int n;
        n=input.nextInt();
        int [] arr = new int[n];
        fill(n,arr);
        Sorted(n,arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        input.close();
    }
}