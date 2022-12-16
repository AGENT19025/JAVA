// Java Program to Format Time in AM-PM format
// date: 15-12-22
// this code is contributed by vishwas
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.List;
import java.util.Vector;
import java.util.Map;
import java.util.HashMap;
public class AMPMFormat
{
    public static Scanner input=new Scanner(System.in);
    public static void Convert(String time)
    {
        String format;
        String [] arr=time.split(":");
        int h=Integer.parseInt(arr[0]);
        if(h>12)
        {
            h=h-12;
            format="PM";
        }
        else if(h==00)
        {
            h=12;
            format="AM";
        }
        else if(h==12)
        {
            h=12;
            format="PM";
        }
        else
        {
            format="AM";
        }
        String hour =String.format("%02d",h);
        String minute=arr[1];
        String seconds=arr[2];

        System.out.println("time in 12 hour for format:"+hour+":"+minute+":"+seconds+":"+format);
    }
    public static void main(String[] args)
    {
        String time=input.nextLine();
        Convert(time);
        input.close();
    }
}