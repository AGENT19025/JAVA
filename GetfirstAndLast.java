// Java Program to Get First and Last Elements from an Array List
// date:17-12-22
// this code is contributed by vishwas
import java.util.Set;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
public class GetfirstAndLast
{
    public static Scanner input=new Scanner(System.in);
    public static ArrayList<Integer> fill(int n,ArrayList<Integer>list)
    {
        for(int i=0;i<n;i++)
        {
            int temp=input.nextInt();
            list.add(temp);
        }
        return list;
    }
    public static int firstElement(int n,ArrayList<Integer>list)
    {
        int res=list.get(0);
        return res;
    }
    public static int lastElement(int n,ArrayList<Integer>list)
    {
        int res=list.get(n-1);
        return res;
    }
    public static void main(String[] args)
    {
        int n=input.nextInt();
        ArrayList<Integer> arrlist=new ArrayList<Integer>();
        fill(n,arrlist);
        System.out.println("first element in arraylist:"+ firstElement(n,arrlist));
        System.out.println("last element in arraylist:"+ lastElement(n,arrlist));
        input.close();
    }
}