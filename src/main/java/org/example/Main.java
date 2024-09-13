package org.example;

import org.example.wordsAlgorithm.palyndromAlgorithm;
import org.example.numeralAlgorithms.factorialAlgorithm;
import org.example.numeralAlgorithms.pairUnpairNumbers;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("#".repeat(15) +"\nSelect option:");
            System.out.println("1: Check palindrome");
            System.out.println("2: Check factorial");
            System.out.println("3: Check pair/unpair numbers");
            System.out.println("X: Exit");

            String option = sc.nextLine();


            switch (option) {
                case "1":
                    palyndromAlgorithm pal = new palyndromAlgorithm();
                    pal.checkPalindromeAlgorithm();
                    break;
                case "2":
                    factorialAlgorithm f = new factorialAlgorithm();
                    f.checkFactorial();
                    break;
                case "3":
                    pairUnpairNumbers p = new pairUnpairNumbers();
                    p.checkPairUnpairNumbers();
                    break;
                case "x":
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }
}
