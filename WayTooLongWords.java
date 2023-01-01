// java program for A. Way Too Long Words in codeforces
// date: 20-12-22
// this code is contributed by vishwas
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;
public class WayTooLongWords
{
    public static Scanner input=new Scanner(System.in);
    public static void output(String s)
    {
        int l=s.length();
        if(l<=10)
        {
            System.out.print(s);
        }
        else
        {
            int temp=l-2;
            System.out.print(s.charAt(0));
            System.out.print(temp);
            System.out.print(s.charAt(l-1));
        }
        
    }
    public static void main(String[] args)
    {
        int t=input.nextInt();
        for(int i=1;i<=t+1;i++)
        {
            String s=input.nextLine();
            output(s);
            System.out.print('\n');
        }
        input.close();
    }
}