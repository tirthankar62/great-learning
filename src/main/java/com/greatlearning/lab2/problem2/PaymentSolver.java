package com.greatlearning.lab2.problem2;

import java.util.*;

public class PaymentSolver {

    public static void main(String[] args) {

        System.out.println("enter the size of currency denominations");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> denomList = new ArrayList<Integer>();
        populateDenomination(denomList, size, sc);

        System.out.println("enter the amount you want to pay");
        int payAmount = sc.nextInt();
        computePayment(denomList, payAmount);
    }

    private static void computePayment(List<Integer> denomList, int payAmount) {

        Collections.sort(denomList, Collections.reverseOrder());
        Map<Integer, Integer> resultMap = new LinkedHashMap<Integer, Integer>();
        int origPayAmount = payAmount;
        for (int denom:
        denomList) {
            if (payAmount>=denom)
            {
                int curDenomQtyReq = payAmount/denom;
                payAmount = payAmount%denom;
                resultMap.put(denom,curDenomQtyReq);
                if(isPaymentDone(resultMap, origPayAmount))
                {
                    System.out.println("Your payment approach in order to give min no of notes will be");
                    for (Map.Entry<Integer,Integer> entry : resultMap.entrySet()){
                        System.out.println(entry.getKey() + ":" + entry.getValue());
                    }
                    return;
                }
            } else {
                // try lower denom;
                continue;
            }
        }

        System.out.println("Payment is not possible");
    }

    private static boolean isPaymentDone(Map<Integer, Integer> resultMap, int payAmount) {
        int totalAmount = 0;
        for (Map.Entry<Integer,Integer> entry : resultMap.entrySet()){
            totalAmount = totalAmount + entry.getKey() * entry.getValue();
        }
        if (totalAmount == payAmount)
        {
            return true;
        } else {
            return false;
        }
    }

    private static void populateDenomination(List<Integer> denomList, int size, Scanner sc) {

        System.out.println("enter the currency denominations value");
        for(int i=0; i< size; i++)
        {
            int tr = sc.nextInt();
            denomList.add(tr);
        }
    }
}
