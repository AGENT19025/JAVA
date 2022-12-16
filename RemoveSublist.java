// remove a SubList from a List in Java
// date 16-12-22
// this code is contributed by vishwas
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Vector;
import java.util.Map;
import java.util.HashMap;
public class RemoveSublist
{
    public static Scanner input =new Scanner(System.in);
    public static LinkedList<Integer> fill(int n,LinkedList<Integer> list)
    {
        for(int i=0;i<n;i++)
        {
            int temp=input.nextInt();
            list.add(temp);
        }
        return list;
    }
    public static void Removesub(int n,LinkedList<Integer>list,int x,int y)
    {
        list.subList(x,y).clear();
        System.out.print("list after removing subList:"+list);
    }
    public static void main(String[] args)
    {
        int n=input.nextInt();
        int x=input.nextInt();
        int y=input.nextInt();
        LinkedList<Integer> list=new LinkedList<Integer>();
        fill(n,list);
        Removesub(n,list,x,y);
        input.close();
    }
}