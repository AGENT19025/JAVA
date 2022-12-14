// Java Program to Find Common Elements Between Two Arrays
// date : 14-12-22
// this code is contributed by vishwas
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Vector;
public class findCommonElements
{
    public static Scanner input=new Scanner(System.in);
    public static void removeSame(int n,int [] arr)
    {
        Vector<Integer> v2=new Vector<Integer>();
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[i+1]) v2.add(arr[i]);
        }
        v2.add(arr[n-1]);
        for(int i=0;i<v2.size();i++)
        {
            System.out.print(v2.get(i)+" ");
        }
    }
    public static int[] fill(int n,int [] arr)
    {
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        return arr;
    }
    public static void check(int a1,int[] A1,int a2,int [] A2 )
    {
        Vector<Integer> v1=new Vector<Integer>();
        if(a1>a2)
        {
            for(int i=0;i<a1;i++)
            {
                for(int j=0;j<a2;j++)
                {
                    if(A1[i]==A2[j]) v1.add(A1[i]);
                }
            }  
        }
        else
        {
            for(int i=0;i<a2;i++)
            {
                for(int j=0;j<a1;j++)
                {
                    if(A2[i]==A1[j]) v1.add(A2[i]);
                }
            }
        }
        int temp=v1.size();
        int [] arr=new int[temp];
        for(int i=0;i<temp;i++)
        {
            arr[i]=v1.get(i);
        }
        removeSame(temp,arr);
    }
    public static void main(String[] args)
    {
        int a1=input.nextInt();
        int a2=input.nextInt();
        int [] A1=new int[a1];
        int [] A2=new int[a2];
        fill(a1,A1);
        fill(a2,A2);
        check(a1,A1,a2,A2);
        input.close();
    }
}