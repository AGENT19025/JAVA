// Find a Sublist in a List in Java
// date:16-12-22
// this code is contributed by vishwas
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Map;
import java.util.ArrayList;
import java.util.Stack;
import java.util.HashMap;
import java.util.Set;
//import java.util.SubList;
public class sublistInList
{
    public static Scanner input=new Scanner(System.in);
    public static ArrayList<Integer> fill(int n,ArrayList<Integer> arrlist)
    {
        for(int i=0;i<n;i++)
        {
            int temp=input.nextInt();
            arrlist.add(temp);
        }
        return arrlist;
    }
    public static void method1(int n,ArrayList<Integer> arrlist,int x,int y)
    {
        //ArrayList<Integer> arrlist2=new ArrayList<>();
        List<Integer> arrlist2=arrlist.subList(x,y);
        for(int i=0;i<arrlist2.size();i++)
        {
            System.out.print(arrlist2.get(i)+" ");
        }
        System.out.print("sublist:"+arrlist2);
    }
    public static void main(String[] args)
    {
        int n=input.nextInt();
        ArrayList<Integer> arrlist=new ArrayList<Integer>();
        int x=input.nextInt();
        int y=input.nextInt();
        fill(n,arrlist);
        method1(n,arrlist,x,y);
        input.close();
    }
}