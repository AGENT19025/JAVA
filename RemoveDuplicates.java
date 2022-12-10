// Remove duplicates from sorted array
// date : 09-12-22
// this  code is contributed by vishwas
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
public class RemoveDuplicates{
    public static Scanner input =new Scanner(System.in);
    public static int [] fill(int n,int[] arr)
    {
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        return arr;
    }
    public static int RemoveDupli(int n,int [] arr)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        int temp=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[temp++]=arr[i];
            }
        }
        arr[temp++]=arr[n-1];
        return temp;
    }
    public static void main(String[] args)
    {
        int n=input.nextInt();
        int [] arr =new int[n];
        fill(n,arr);
        n=RemoveDupli(n,arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] +" ");
        }
        input.close();
    }
}