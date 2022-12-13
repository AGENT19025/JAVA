//Java Program to Merge Two Arrays
// date :11-12-22
// this code is contributed by vishwas

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
public class MergetwoArrays
{
    public static Scanner input=new Scanner(System.in);
    public static int [] fill(int n,int [] arr)
    {
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
            
        }
        return arr;
    }
    public static void MergeArrays(int a1,int []A1,int a2,int []A2 )
    {
        int l=a1+a2;
        int [] m=new int [l];
        for(int i=0;i<a1;i++)
        {
            m[i]=A1[i];
            
        }
        for(int i=0;i<a2;i++)
        {
            m[a1+i]=A2[i];
        }
        for(int i=0;i<l;i++)
        {
            System.out.print(m[i]+" ");
        }
    }
    /*public static void Result(int [] m)
    {
        int n=m.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(m[i]+" ");
        }
    }*/
    public static void main(String[] args)
    {
        int a1=input.nextInt();
        int a2=input.nextInt();
        int [] A1=new int[a1];
        int [] A2=new int[a2];
        fill(a1,A1);
        fill(a2,A2);
        MergeArrays(a1,A1,a2,A2);
        input.close();
    }
}