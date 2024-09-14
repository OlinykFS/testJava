package org.example;

import org.example.wordsAlgorithm.palyndromAlgorithm;
import org.example.numeralAlgorithms.factorialAlgorithm;
import org.example.numeralAlgorithms.pairUnpairNumbers;
import org.example.numeralAlgorithms.calculator;
import org.example.oopClases.animals.DogAye;
import org.example.games.kubik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("#".repeat(15) +"\nSelect option:");
            System.out.println("1: Check palindrome");
            System.out.println("2: Check factorial");
            System.out.println("3: Check pair/unpair numbers");
            System.out.println("4: Calculator (+,-,:,*)");
            System.out.println("5: Sozdat Eblana");
            System.out.println("6: Kubik");
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
                case "4":
                    calculator c = new calculator();
                    c.calculate();
                    break;
                case "5":
                    DogAye dog = new DogAye();
                    dog.SozdatEblana();
                    break;
                case "6":
                    kubik kubik = new kubik();
                    kubik.kubikDice();
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
