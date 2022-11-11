package week3;

import java.util.Scanner;

public class PrintStarTraingle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lines=sc.nextInt();
        int startIncr = 1;

        for (int i=0; i<lines; i++)
        {
            int stars = i+startIncr;
            int gaps = (lines-i) * 2 - 2;
            for(int g=0;g<gaps/2; g++)
            {
                System.out.print(" ");
            }
            for(int s=0;s<stars; s++)
            {
                System.out.print("*");
            }
            for(int g=0;g<gaps/2; g++)
            {
                System.out.print(" ");
            }
            startIncr++;
            System.out.println();
        }
    }
}
