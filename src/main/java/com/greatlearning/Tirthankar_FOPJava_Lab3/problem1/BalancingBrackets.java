package com.greatlearning.Tirthankar_FOPJava_Lab3.problem1;

import java.util.Scanner;
import java.util.Stack;

public class BalancingBrackets {

    public static void main(String[] args) {

        System.out.println("enter the equation");
        Scanner sc = new Scanner(System.in);
        String equation = sc.nextLine();

        Boolean result = checkIfBalanced(equation);

        // Function call
        if (result)
            System.out.println("The entered String has Balanced Brackets");
        else
            System.out.println("The entered Strings do not contain Balanced Brackets");

        sc.close();
    }

    private static Boolean checkIfBalanced(String equation) {

        Stack<Character> stack = new Stack<Character>();

        // Traversing the Expression
        for (int i = 0; i < equation.length(); i++) {
            char x = equation.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                // Push in the stack
                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        // Check Empty Stack
        return (stack.isEmpty());
    }
}
