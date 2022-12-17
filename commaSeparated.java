// Convert a List of String to a comma separated String in Java
// date:17-12-22
// this is code is contributed by vishwas
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Map;
import java.util.HashMap;
public class commaSeparated
{
    public static Scanner input =new Scanner(System.in);
    public static List<String> fill(int n,List<String>list)
    {
        for(int i=0;i<n;i++)
        {
            String temp=input.nextLine();
            list.add(temp);
        }
        System.out.println(list);
        return list;
    }
    public static void output(int n,List<String>list)
    {
        String string =String.join(",", 6list);
        System.out.println(string);
    }
    public static void main(String[] args)
    {
        int n=input.nextInt();
        List<String> list=new ArrayList<String>();
        fill(n,list);
        output(n,list);
        input.close();
    }
}