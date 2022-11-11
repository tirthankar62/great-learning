package week3;

import java.util.Scanner;

public class PrintStarLeft {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lines=sc.nextInt();
        for (int i=1; i<=lines; i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
