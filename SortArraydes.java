 // java program to sort array in descending order
 //date: 09-12-22
 //this code is contributed by vishwas
 import java.util.Scanner;
 import java.util.Arrays;
 import java.util.List;
 public class SortArraydes{
    public static Scanner input=new Scanner(System.in);
    static int [] fill(int n,int[] arr)
    {
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        return arr;
    }
    public static int[] Sorted(int n,int[] arr)
    {
        int temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[i])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void output(int n,int []arr)
    {
        for(int num:arr)
        {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args)
    {
        int n;
        n=input.nextInt();
        int [] arr=new int[n];
        fill(n,arr);
        Sorted(n,arr);
        output(n,arr);
        input.close();
    }
 }