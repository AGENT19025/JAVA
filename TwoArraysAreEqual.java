// Java Program to Check if Two Arrays Are Equal or Not
// date : 13-12-22
// this code is contributed by vishwas
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
public class TwoArraysAreEqual
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
    public static void check(int a1,int []A1,int a2,int [] A2)
    {
        int cnt=0;
        if(a1!=a2)
        {
            System.out.print("Two Arrays are not equal");   
        }
        else
        {
            for(int i=0;i<a1;i++)
            {
                if(A1[i]==A2[i])
                {
                    cnt++;
                }
                else
                {
                    System.out.print("Two Arrays are not equal");
                    break;
                }
            }
        }
        if(cnt==a1) System.out.print("Two Arrays are Equal");
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