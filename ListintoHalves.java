// Split a List into Two Halves in Java
// date:16-12-22
// this code is contributed by vishwas
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
public class ListintoHalves
{
    public static Scanner input = new Scanner(System.in);
    public static LinkedList<Integer> fill(int n,LinkedList<Integer>list)
    {
        for(int i=0;i<n;i++)
        {
            int temp=input.nextInt();
            list.add(temp);
        }
        return list;
    }
    public static void method1(int n,LinkedList<Integer>list)
    {
        LinkedList<Integer> l1=new LinkedList<Integer>();
        LinkedList<Integer> l2=new LinkedList<Integer>();
        for(int i=0;i<list.size()/2;i++)
        {
            l1.add(list.get(i));
        }
        for(int i=list.size()/2;i<n;i++)
        {
            l2.add(list.get(i));
        }
        System.out.print("first list:"+l1);
        System.out.println("Second list:"+l2);
    }
    public static void main(String[] args)
    {
        int n=input.nextInt();
        LinkedList<Integer> list=new LinkedList<Integer>();
        fill(n,list);
        method1(n,list);
        input.close();
    }
}