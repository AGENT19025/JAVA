// java program for A. Translation in codeforces 
// date : 29-12-22
// this code is contributed by vishwas
 import java.util.Scanner;
 import java.util.Set;
 import java.util.Arrays;
 import java.util.List;
 import java.util.Vector;
 import java.util.LinkedList;
 import java.util.Stack;
 import java.util.Map;
 import java.util.HashMap;

 public class Translation
 {
    public static Scanner input=new Scanner(System.in);
    public static boolean check(String s1,String s2)
    {
        int n1=s1.length();
        int n2=s2.length();
        if(n1!=n2) return false;
        int cnt=0;
        for(int i=0;i<s1.length();i++)
        {
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(n1-i-1);
            if(ch1==ch2) cnt++; 
        }
        if(cnt==n1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        String s1=input.nextLine();
        String s2=input.nextLine();
        if(check(s1,s2))
        {
            System.out.println("YES");
        } 
        else
        {
            System.out.println("NO");
        }
        input.close();
    }
 }