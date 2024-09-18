package org.example;

import org.example.wordsAlgorithm.palyndromAlgorithm;
import org.example.numeralAlgorithms.factorialAlgorithm;
import org.example.numeralAlgorithms.pairUnpairNumbers;
import org.example.numeralAlgorithms.calculator;
import org.example.oopClases.animals.DogAye;
import org.example.games.kubik;
import org.example.todolist.todoTasker;
import org.example.wordsAlgorithm.WordsScanner;
import org.example.wordsAlgorithm.palyndromSuperCheker;
import org.example.numeralAlgorithms.UniqueSum;
import org.example.numeralAlgorithms.LargestNumber;
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
            System.out.println("5: Sozdat Dog");
            System.out.println("6: Kubik");
            System.out.println("7: Tasker");
            System.out.println("8: Words Scanner");
            System.out.println("9: Palyndrom Algorithm Super");
            System.out.println("10: Check Unique number sum (Enter number like this 1 2 2 3 4 5)");
            System.out.println("11: Check Largest number sum of list (Enter number like this 1 2 2 3 4 5)");
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
                case "7":
                    todoTasker task = new todoTasker();
                    task.letsTodoTasker();
                    break;
                case "8":
                    WordsScanner wordsScanner = new WordsScanner();
                    wordsScanner.StringChecker();
                    break;
                case "9":
                    palyndromSuperCheker psp = new palyndromSuperCheker();
                    System.out.println("Enter the mega palyndrom");
                    String word = sc.nextLine();
                    boolean result = psp.palyndromSuper(word);
                    if(result){
                        System.out.println("This " + word + " is a palyndrome");
                    } else {
                        System.out.println("This " + word + " is not a palyndrome");
                    }
                    System.out.println("Press enter to continue");
                    sc.nextLine();

                    break;
                case "10":
                    System.out.println("Enter list of number");
                    String number = sc.nextLine();
                    String[] numbers = number.split(" ");
                    int[] nums = new int[numbers.length];
                    for(int i = 0; i < numbers.length; i++){
                        nums[i] = Integer.parseInt(numbers[i]);
                    }
                    UniqueSum USum = new UniqueSum();
                    int iresult = USum.sumOfUnique(nums);
                    System.out.println("result of sum unique numbers is  " + iresult);
                    System.out.println("Press enter to continue");
                    sc.nextLine();
                    break;
                case "11":
                    System.out.println("Enter list of number");
                    String numsS = sc.nextLine();
                    String[] Lnums = numsS.split(" ");
                    int[] nums2 = new int[Lnums.length];
                    for(int i = 0; i < Lnums.length; i++){
                        nums2[i] = Integer.parseInt(Lnums[i]);
                    }
                    LargestNumber lNum = new LargestNumber();
                    String lresult = lNum.largestNumber(nums2);
                    System.out.println("result of largest number is  " + lresult);
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
