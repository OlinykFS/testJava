package org.example.wordsAlgorithm;

import java.util.Scanner;

public class palyndromAlgorithm {
    public void checkPalindromeAlgorithm() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter String (or type 'exit' to quit): ");
            String s = sc.nextLine();

            if (s.trim().equalsIgnoreCase("exit")) {
                System.out.println("-".repeat(17) + "\nPalyndrom Exit" + "\n-".repeat(4));
                break;
            }

            String formattedS = s.replaceAll("\\s", "").toLowerCase();
            String reversedS = new StringBuilder(formattedS).reverse().toString();

            if (s.trim().isEmpty()) {
                System.out.println("Empty String");
            } else if (formattedS.equals(reversedS)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
