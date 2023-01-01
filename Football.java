// java program for A. Football in codeforces
// date:18-12-22
// this code is contributed by vishwas
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
import java.util.Vector;
public class Football
{
    public static Scanner input=new Scanner(System.in);
    public static void FootBall(String s)
    {
        int l=s.length();
        int cnt=0;
        for(int i=0;i<l-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                cnt++;
            }
            else
            {
                cnt=0;
            }
            if(cnt==6)
            {
                System.out.println("YES");
                break;
            }
        }
        if(cnt<=5)
        {
            System.out.println("NO");
        }
    }
    public static void main(String[] args)
    {
        String s=input.nextLine();
        FootBall(s);
        input.close();
    }
}