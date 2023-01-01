// java program for A. Petya and Strings in codeforces
// date: 20-12-22
// this code is contributed by vishwas
import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
public class PentyAndStrings
{
    public static Scanner input =new Scanner(System.in);
    public static void main(String[] args)
    {
        String s1=input.nextLine();
        String s2=input.nextLine();
        String n1=s1.toLowerCase();
        String n2=s2.toLowerCase();
        int cnt=0;
        for(int i=0;i<s1.length();i++)
        {
            char ch=n1.charAt(i);
            char hc=n2.charAt(i);
            if(ch>hc)
            {
                System.out.println("1");
                cnt++;
                break;
            }
            if(hc>ch)
            {
                System.out.println("-1");
                cnt++;
                break;
            }
        }
        if(cnt == 0)
        {
            System.out.println("0");
        }
        input.close();
        
    }
}
