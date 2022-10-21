package week2;
import java.util.*;
import java.lang.Math; 


class PrimeSwitch{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the no.: ");
        int n = sc.nextInt();
        switch(n)
        {
            case 0: System.out.println(n + " is neither prime or composite"); break;
            case 1: System.out.println(n + " is neither prime or composite"); break;
            case 2: System.out.println(n + " is prime"); break;
            case 3: System.out.println(n + " is prime"); break;
            default:
            {
                String res = PrimeSwitch.isPrime(n) ? n + " is prime" : n + " is not a prime";
                System.out.println(res);
            }
        }
    }
    public static boolean isPrime(int n)
    {
        int sqrtN = (int) Math.sqrt(n);
        int i = 2;
        while(i<=sqrtN)
        {
            if(n%i==0)
            {
                return false;
            }
            i++;
        }
        return true;
    }
}