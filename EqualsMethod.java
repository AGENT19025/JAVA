// Short equals() method in Java with Examples
//  date:15-12-22
// this code is contributed by vishwas 
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Vector;
public class EqualsMethod
{
    
    public static Scanner input =new Scanner(System.in);
    /*public static void check(int a,int b)
    {
        if(a.equals(y))
        {
            System.out.print("given integers are same");
        }
        else
        {
            System.out.print("given intergers are not same");
        }
    }*/
    public static void main(String[] args)
    {
        Short a,b;
        a=input.nextShort();
        b=input.nextShort();
        //check(a,b);
        boolean output=a.equals(b);
        if(output)
        {
            System.out.print("given shorts are equal");
        }
        else
        {
            System.out.print("given shorts are not equal");
        }
        input.close();
    }
}