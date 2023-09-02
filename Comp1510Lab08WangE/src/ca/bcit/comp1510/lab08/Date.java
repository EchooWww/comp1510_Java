package ca.bcit.comp1510.lab08;

//import java.util.Scanner;



/**
 * Represent a valid Gregorian date on or after 24 February 1582.
 * @author blink, echo
 * @version 2.0
 */
public class Date {
    
    /** day of month.  1 .. max days in month */
    private int day;
    
    /** month of year.  1 .. 12 */
    private int month;
    
    /** year in Gregorian calendar.  1001 .. 2999 */
    private int year;
    
    /**
     * The date.
     * @param theDay the day
     * @param theMonth the month
     * @param theYear the year
     */
    public Date(int theDay, int theMonth, int theYear) 
            throws IllegalArgumentException {
        if (!isDateValid(theDay, theMonth, theYear)) {
            System.out.println("Date is not valid.");
            throw new IllegalArgumentException("Date is not valid.");
        }
        day = theDay;
        month = theMonth;
        year = theYear;
    }
    
    /**
     * Getter of day.
     * @return the day
     */
    public int getDay() {
        return day;
    }
    
    
    /**
     * Getter of month.
     * @return the month
     */
    public int getMonth() {
        return month;
    }
    
    /**
     * Getter of year.
     * @return the year
     */
    public int getYear() {
        return year;
    }
    
    /**
     * Check if the month is valid.
     * @param m month
     * @return if valid
     */
    public static boolean isMonthValid(int m) {
        final int twelve = 12;
        return (m >= 1 && m <= twelve);
    }
    
    /**
     * Check if the year is valid.
     * @param year the year
     * @return if valid
     */
    public static boolean isYearValid(int year) {
        final int lower = 1582;
        final int higher = 2999;
        return (year >= lower && year <= higher);
    }
    
    /**
     * Check if the year is leap year.
     * @param year the year
     * @return if leap year
     */
    public static boolean isLeapYear(int year) {
        final int f = 4;
        final int h = 100;
        final int fh = 400;
        return (year % fh == 0 || year % f == 0 && year % h != 0);
    }    
    
    /**
     * Days in a month.
     * @param month the month
     * @param isLeapYear whether leap year
     * @return days in the month
     */
    public static int daysInMonth(int month, boolean isLeapYear) {
        
        int days;
        
        final int three = 3;
        final int four = 4;
        final int five = 5;
        final int six = 6;
        final int seven = 7;
        final int eight = 8;
        final int nine = 9;
        final int ten = 10;
        final int eleven = 11;
        final int twelve = 12;
        final int te = 28;
        final int tn = 29;
        final int thirty = 30;
        final int to = 31;
        
        switch (month) {
            case 1, three, five, seven, eight, ten, twelve:
                days = to;
                break;
            case four, six, nine, eleven:
                days = thirty;
                break;
            default:
                if (isLeapYear) {
                    days = tn; 
                } else {
                    days = te; 
                }   
                break;
        }
        return days;
    }
    
    /**
     * Check if the day is valid.
     * @param y the year
     * @param m the month
     * @param d the day
     * @return whether it is valid
     */
    public static boolean isDayValid(int d, int m, int y) {
        return (d >= 1 && d <= daysInMonth(m, isLeapYear(y)));
    }
    
    /**
     * Check if the date is valid.
     * @param year the year
     * @param month the month
     * @param day the day
     * @return if valid
     */
    public static boolean isDateValid(int day, int month, int year) {
        final int lower = 1582;
        final int d1 = 24;
        return (isMonthValid(month) && isYearValid(year) 
            && isDayValid(day, month, year) 
            && 
            (year != lower
             || year == lower && month > 2 
             || year == lower && month == 2 && day >= d1));
    }
    
    /**
     * Concate the information.
     * @return the information of the date object.
     */
    public String toString() {
        String info = "Date is valid, the year is " + (isLeapYear(year) 
                        ?  "" : "not ") + "a leap year.";
        return info;
    }   
}
//        
//                /**
//                 * Drives the program.
//                 * @param args unused
//                 */
//                public static void main(String[] args) {
//                
//                Scanner scan = new Scanner(System.in);
//        
//                System.out.println("Please enter a date, with month, day, "
//                        + "and year being integers, separated with a comma:");
//                String input = scan.nextLine();
//                scan.close();
//                Scanner myscanner = new Scanner(input);
//                myscanner.useDelimiter(",");
//                int month = Integer.parseInt(myscanner.next());
//                int day = Integer.parseInt(myscanner.next());
//                int year = Integer.parseInt(myscanner.next());
//                myscanner.close();
//                Date date = new Date(day, month, year);
//                System.out.println(date);
//           } 
//} 
