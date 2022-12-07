// Insert a String into another String in Java
// date : 07-12-22

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class StringinToAnother{
    static String insertS(String a,String b,int n)
    {
        String newString=new String();
        for(int i=0;i<a.length();i++)
        {
            newString+=a.charAt(i);
            if(i==n)
            {
                newString+=" ";
                newString+=b;
            }
        }
        return newString;
    }
    public static void main(String[] args)
    {
        int index;
        String ors,sti;
        Scanner input = new Scanner(System.in);
        ors=input.nextLine();
        sti=input.nextLine();
        index=input.nextInt();
        System.out.println("new string after inserting another string:"+insertS(ors,sti,index));
        input.close();
    }
}