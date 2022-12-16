// Java Program to Display Dates of a Calendar Year in Different Format
// date: 15-12-22
// this code is contributed by vishwas
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.List;
import java.util.Vector;
import java.util.Map;
import java.util.HashMap;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DisplayDate
{
    public static Scanner input=new Scanner(System.in);
    public static void method1()
    {
        LocalDate date=LocalDate.now();
        System.out.println("method-1:"+date);
    }
    public static void method2()
    {
        LocalDateTime date=LocalDateTime.now();
        DateTimeFormatter myDateFormat= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = date.format(myDateFormat);
        System.out.println("method-2:"+ formattedDate);
    }
    public static void method3()
    {
        LocalDateTime date=LocalDateTime.now();
        DateTimeFormatter myDateformat=DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy");
        String formattedDate=date.format(myDateformat);
        System.out.println("method-3:"+formattedDate);
    }
    public static void main(String[] args)
    {
        method1();
        method2();
        method3();
        input.close();
    }
}