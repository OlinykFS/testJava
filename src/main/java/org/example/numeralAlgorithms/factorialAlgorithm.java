package org.example.numeralAlgorithms;

import java.util.Scanner;

public class factorialAlgorithm {
    public void checkFactorial() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a positive integer or type 'exit' to quit: ");
            String input = sc.nextLine();

            if (input.trim().equalsIgnoreCase("exit")) {
                System.out.println("-".repeat(17) + "\nfactorial Exit" + "\n-".repeat(4));
                break;
            }

            try {
                int n = Integer.parseInt(input);
                if (n < 0) {
                    System.out.println("Not a positive number");
                } else {
                    long factorial = 1;
                    for (int i = 1; i <= n; i++) {
                        factorial *= i;
                    }
                    System.out.println("Factorial: " + factorial + " for number: " + n);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer or 'exit'.");
            }
        }
    }
}
