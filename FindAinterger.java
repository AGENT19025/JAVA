// java program to Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.
// date:01/01/23
// this code is contributed by vishwas 
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.Map;
import java.util.Stack;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ArrayList;
public class FindAinterger
{
    public static Scanner input=new Scanner(System.in);
    public static int [] fill(int [] arr)
    {
        for(int i=0;i<10;i++)
        {
            arr[i]=input.nextInt();
        }
        return arr;
    }
    public static boolean check(int [] arr,int k)
    {
        for(int i=0;i<10;i++)
        {
            if(arr[i]==k) return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        int [] arr=new int [10];
        fill(arr);
        int k=input.nextInt();
        if(check(arr,k))
        {
            System.out.println("Given k is presented in the array ");
        }
        else
        {
            System.out.println("Given k is not presented in the array");
        }
        input.close();
    }
}