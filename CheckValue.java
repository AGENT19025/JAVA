// Check if a value is present in an Array in Java
// date 09-12-22
//this code is contributed by vishwas

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;


public class CheckValue{
    public static Scanner input=new Scanner(System.in);
    static int[] ar(int x,int[] arr)
    {
        for(int i=0;i<x;i++)
        {
            arr[i]=input.nextInt();
        }
        return arr;
    }
    static int check(int x,int[] arr,int a)
    {
        int cnt=0;
        for(int i=0;i<x;i++)
        {
            if(arr[i]==a)
            {
                cnt++;
            }
    
        }
        return cnt;
    }
    public static void main(String[] args)
    {
        int n;
        n=input.nextInt();
        int [] arr=new int[n];
        ar(n,arr);
        int v;
        v=input.nextInt();
        int res=check(n,arr,v);
        if(res>0)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
            
        }
        input.close();   
    }
}