//  sort an ArrayList in Ascending Order in Java
// date:17-12-22
// this code is contributed by vishwas
import java.util.Arrays;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Stack;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
public class ArraylistSort
{
    public static Scanner input=new Scanner(System.in);
    public static ArrayList<Integer> fill(int n,ArrayList<Integer> list)
    {
        for(int i=0;i<n;i++)
        {
            int temp=input.nextInt();
            list.add(temp);
        }
        return list;
    }
    public static void Output(int n,ArrayList<Integer>list)
    {
        Collections.sort(list);
        System.out.print(list);
    }
    public static void main(String[] args)
    {
        int n=input.nextInt();
        ArrayList<Integer> arrlist=new ArrayList<Integer>();
        fill(n,arrlist);
        Output(n,arrlist);
        input.close();
    }
}