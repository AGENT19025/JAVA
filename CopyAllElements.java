// java Program to Copy All the Elements of One Array to Another Array
// date: 14-12-22
// this code is contributed by vishwas
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.List;
import java.util.Vector;
import java.util.Map;
import java.util.HashMap;
public class CopyAllElements
{
    public static Scanner input =new Scanner(System.in);
    public static int [] fill(int n,int [] arr)
    {
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        return arr;
    }
    public static void copyElements(int n,int [] arr)
    {
        int [] B=new int[n];
        B=arr;
        for(int i=0;i<n;i++)
        {
            System.out.print(B[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int n=input.nextInt();
        int [] A=new int [n];
        fill(n,A);
        copyElements(n,A);
        input.close();
    }
}