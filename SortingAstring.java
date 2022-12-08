// Sort a String in Java
// date:08-12-22
// This code contribution by vishwas 

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class SortingAstring{
    static String SortAstring(String x)
    {
        char arr[]=x.toCharArray();
        int n=x.length();
        char temp;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[i])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return new String(arr);
    }
    public static void main(String[] args)
    {
        String s;
        Scanner input=new Scanner(System.in);
        s=input.nextLine();
        System.out.println(SortAstring(s));
        input.close();
    }
}