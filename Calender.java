/*
The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a
 set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

Example     The method should return  as the day on that date.
Function Description :
Complete the findDay function in the editor below.
findDay has the following parameters:   int: month     int: day    int: year
Returns string: the day of the week in capital letters
Input Format        A single line of input containing the space separated month, day and year, respectively, in    format.

Constraints                 Sample Input    08 05 2015
                            Sample Output   WEDNESDAY       Explanation        :   The day on August th  was WEDNESDAY.

*/

import java.util.*;
import java.time.LocalDate;               //package Declaration
import java.io.*;
class CalenderCheck                       //class Name . It Is Good Practice to save same file with the same className.
{
    public static void main(String[] args)          //Main Function execution always start from This..
    {
        System.out.println("we are in main class.");
         Scanner s=new Scanner(System.in);
         System.out.println("Enter Month date and Year in formatt DD,MM,YYYY ");
         int month=s.nextInt();
         int date=s.nextInt();
         int year=s.nextInt();
         String day= findDay(month,date,year);
         System.out.println(day);
        
    }
    
    public static String findDay(int month, int day, int year) 
    {
        Calendar c = Calendar.getInstance();
        c.set(year, month, day);
        return LocalDate.of(year, month, day).getDayOfWeek().toString();
    }
}
