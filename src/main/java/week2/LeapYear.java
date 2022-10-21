package week2;
import java.util.*;  

class LeapYear {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the year to check: ");
        int year = sc.nextInt();
        if ( (year%100==0) && (year%400==0))
        {
            System.out.println("The " + year + " is a leapyear");
        } else if((year%100!=0) && (year%4==0))
        {
            System.out.println("The " + year + " is a leapyear");
        } else {
            System.out.println("The " + year + " is not a leapyear");
        }
    }
}