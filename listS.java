// Initializing a List in Java
// date:15-12-22
// this code is contributed by vishwas 
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Vector;
//import jave.util.function.suppliers;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
public class listS
{
    public static Scanner input=new Scanner(System.in);
    public static void list1(int n,ArrayList<Integer> list)
    {
        for(int i=0;i<n;i++)
        {
            int temp=input.nextInt();
            list.add(temp);
        }
        System.out.print("ArrayList:");
        for(int i=0;i<n;i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
    public static void LinkS(int n,LinkedList<Integer> ll)
    {
        int temp=0;
        for(int i=0;i<n;i++)
        {
            temp=input.nextInt();
            ll.add(temp);
        }
        System.out.print("Linkedlist:");
        for(int i=0;i<n;i++)
        {
            System.out.print(ll.get(i)+" ");
        }
    }
    public static void Stacks(int n,Stack<Integer> s)
    {
        for(int i=0;i<n;i++)
        {
            int temp=input.nextInt();
            s.push(temp);
        }
        System.out.print("Stack:");
        for(int i=0;i<n;i++)
        {
            System.out.print(s.get(i)+ " ");
        }
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        LinkedList<Integer> ll=new LinkedList<Integer>();
        Stack<Integer> s=new Stack<Integer>();
        int n=input.nextInt();
        list1(n,list);
        Stacks(n,s);
        LinkS(n,ll);
        input.close();
    }
}