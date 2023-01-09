package com.greatlearning.Tirthankar_FOPJava_Lab2.problem1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TargetChecker {

    public static void main(String[] args) {

        System.out.println("enter the size of transaction array");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // Since Thousands of transactions are happening in a day, so a linked list would be more appropriate
        List<Integer> trList = new LinkedList<Integer>();
        populateTransaction(trList, t, sc);
        System.out.println("enter the total no of targets that needs to be achieved");
        int targetCount = sc.nextInt();
        do {
            System.out.println("enter the value of target or -1 to exit");
            int targetValue = sc.nextInt();
            if (targetValue == -1)
            {
                break;
            }
            checkTarget(trList, targetCount,targetValue);

        } while (true);

        sc.close();
    }

    private static void checkTarget(List<Integer> trList, int targetCount, int targetValue) {

        int attempt = 0;
        for (int tr:
        trList) {
            targetValue = targetValue - tr;
            attempt++;
            if (targetValue<=0 && attempt<=targetCount)
            {
                System.out.println("Target achieved after " + attempt + " transactions ");
                return;
            }
        }
        System.out.println("Given target is not achieved");
    }

    private static void populateTransaction(List<Integer> trArr, int count, Scanner sc) {

        System.out.println("enter the values of array");
        for(int i=0; i< count; i++)
        {
            int tr = sc.nextInt();
            trArr.add(tr);
        }
    }
}
