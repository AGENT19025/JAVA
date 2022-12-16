// Java Program For Array Rotation
// date :14-12-22
// this code is contributed by vishwas
import java.util.Arrays;
import java.util.Set;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class ArrayRotation
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
    public static int keyIndex(int n,int k,int [] arr)
    {
        int res=0;
        for(int i=0;i<n;i++)
        {
            if(k==arr[i]) res=i;
        }
        return res;
    }
    public static void Rotation(int n,int d,int []arr)
    {
        int [] res=new int [n];
        int j=0;
        for(int i=d+1;i<n;i++)
        {
            res[j]=arr[i];
            j++;
        }
        j=d-1;
        for(int i=0;i<d+1;i++)
        {
            res[j]=arr[i];
            j++;
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int n=input.nextInt();
        int k=input.nextInt();
        int [] A=new int [n];
        fill(n,A);
        int d=keyIndex(n,k,A);
        Rotation(n,d,A);
        input.close();
    }
}