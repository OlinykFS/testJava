package org.example.wordsAlgorithm;

import java.util.Scanner;

public class WordsScanner {
    public void StringChecker() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a word or type 'Exit' for exit: ");
            String word = sc.nextLine();
            if (word.equalsIgnoreCase("exit")){
                break;
            }
            int totalChars = 0;
            int letterCount = 0;
            int digitCount = 0;
            int spaceCount = 0;
            int specialCharCount = 0;

            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                totalChars++;
                if (Character.isLetter(currentChar)) {
                    letterCount++;
                } else if (Character.isDigit(currentChar)) {
                    digitCount++;
                } else if (Character.isWhitespace(currentChar)) {
                    spaceCount++;
                } else {
                    specialCharCount++;
                }
            }
            System.out.println("Total words: " + totalChars);
            System.out.println("Total letters: " + letterCount);
            System.out.println("Total digits: " + digitCount);
            System.out.println("Total spaces: " + spaceCount);
            System.out.println("Total specials: " + specialCharCount);

        }
    }
}