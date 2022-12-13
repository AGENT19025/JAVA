// Remove all occurrences of an element from Array in Java
// date 13-12-22
// this code is contributed by vishwas
import java.util.Scanner;
import java.util.Arrays;
import java.util.Vector;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
public class removeALLOccurrance
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
    public static void RemoveAO(int n,int [] arr,int o)
    {
        Vector<Integer>v1=new Vector<Integer>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=o)
            {
                v1.add(arr[i]);
            }
        }
        for(int i=0;i<v1.size();i++)
        {
            System.out.print(v1.get(i)+" ");
        }
        
    }
    public static void main(String[] args)
    {
        int n=input.nextInt();
        int [] a=new int[n];
        int o=input.nextInt();
        fill(n,a);
        RemoveAO(n,a,o);
        input.close();

    }
}