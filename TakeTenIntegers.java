// java program to Take 10 integer inputs from user and store them in an array and print them on screen.
//date:01/01/2023
//this code is contributed by vishwas
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.Vector;
import java.util.List;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
public class TakeTenIntegers
{
    public static Scanner input=new Scanner(System.in);
    public static int [] fill()
    {
        int [] arr=new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=input.nextInt();
        }
        return arr;
    }
    public static void output(int [] arr)
    {
        for(int i=0;i<10;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int [] arr=new int[10];
        arr=fill();
        output(arr);
        input.close();
    }
}