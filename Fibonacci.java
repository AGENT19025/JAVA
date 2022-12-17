// Java Program to Print Fibonacci Series in Different Ways
// date:18-12-22
// this code is contributed by vishwas
import java.util.Scanner;
import java.util.Set;
public class Fibonacci
{
    public static Scanner input=new Scanner(System.in);
    public static void method1(int n)
    {
        int x=0,y=1,z=0;
        System.out.print("method1:"+x+" "+y+" ");
        for(int i=2;i<n;i++)
        {
            z=x+y;
            System.out.print(z+" ");
            x=y;
            y=z;
        }
    }
    public static void method2(int n)
    {
        int [] a=new int[n+2];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<n;i++)
        {
            a[i]=a[i-1]+a[i-2];
        }
        System.out.print("method 2:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int n=input.nextInt();
        method1(n);
        method2(n);
        input.close();
    }
}