// Java Program to Add Element at First and Last Position of a Linked list
// date: 18-12-22
// this code is contributed by vishwas
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
public class AddElementFirstLast
{
    public static Scanner input=new Scanner(System.in);
    public static LinkedList<Integer> fill(int n,LinkedList<Integer>list)
    {
        for(int i=0;i<n;i++)
        {
            int temp=input.nextInt();
            list.add(temp);
        }
        return list;
    }
    public static void addElements(int n,int x,int y,LinkedList<Integer>list)
    {
        list.addFirst(x);
        list.addLast(y);
        System.out.println("List after adding 2 elements in first and last:"+list);
    }
    public static void main(String[] args)
    {
        int n=input.nextInt();
        int x=input.nextInt();
        int y=input.nextInt();
        LinkedList<Integer> linkedlist=new LinkedList<Integer>();
        fill(n,linkedlist);
        addElements(n,x,y,linkedlist);
        input.close();
    }
}