// Remove Duplicates from ArrayList in Java
// date : 16-12-22
// this code is contributed by vishwas
import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashSet;
public class DupilFromArrayList
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
    public static void RemoveDupli(int n,ArrayList<Integer>list)
    {
        Set<Integer> set=new LinkedHashSet<Integer>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        System.out.print("Arraylist After Removing Duplicate Elements:"+list);
    }
    public static void main(String[] args)
    {
        int n=input.nextInt();
        ArrayList<Integer> arrlist=new ArrayList<Integer>();
        fill(n,arrlist);
        RemoveDupli(n,arrlist);
        input.close();
    }
}