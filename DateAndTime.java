// Java Program to Display Current Date and Time
// date : 15-12-22
// this code is contributed by vishwas
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.Vector;
import java.util.List;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class DateAndTime
{
    public static void method1()
    {
        Date current_date=new Date();
        System.out.println("method-1:" +current_date);
    }
    public static void main(String[] args)
    {
        method1();
    }
}