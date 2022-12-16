// Min and Max in a List in Java
// date: 16-12-22
// this code is contributed by vishwas
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.List;
import java.util.Vector;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;
public class maxmin
{
    public static Scanner input=new Scanner(System.in);
    public static LinkedList<Integer> fill(int n,LinkedList<Integer> list)
    {
        for(int i=0;i<n;i++)
        {
            int temp=input.nextInt();
            list.add(temp);
        }
        return list;
    }
    public static void maximum(int n,LinkedList<Integer> list)
    {
        int temp=0;
        for(int i=0;i<n;i++)
        {
            if(list.get(i)>temp) temp=list.get(i);
        }
        System.out.println("maximum element in list:"+temp);
    }
    public static void minimum(int n,LinkedList<Integer> list)
    {
        int temp=list.get(0);
        for(int i=0;i<n;i++)
        {
            if(temp>list.get(i)) temp=list.get(i);
        }
        
        System.out.println("minimum element in list:"+temp);
    }
    public static void main(String[] args)
    {
        int n=input.nextInt();
        LinkedList<Integer> list=new LinkedList<Integer>();
        fill(n,list);
        maximum(n,list);
        minimum(n,list);
        input.close();
    }
}