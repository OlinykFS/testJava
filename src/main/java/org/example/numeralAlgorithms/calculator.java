package org.example.numeralAlgorithms;

import java.util.Scanner;

public class calculator {
    public void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println("Enter sec number");
        int sec = sc.nextInt();
        System.out.println("Enter operation (+, -, :, *)");
        String op = sc.next();
        int result;
        switch (op) {
            case "+":
                result = num + sec;
                System.out.println("The result is: " + result);
                break;
            case "-":
                result = num - sec;
                System.out.println("The result is: " + result);
                break;
            case ":":
                if (sec == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    result = num / sec;
                    System.out.println("The result is: " + result);
                }
                break;
            case "*":
                result = num * sec;
                System.out.println("The result is: " + result);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }

        System.out.println("Press Enter to continue");
        sc.nextLine();
        sc.nextLine();
    }
}

