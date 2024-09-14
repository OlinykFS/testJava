package org.example.numeralAlgorithms;

import java.util.Scanner;

public class calculator {
    public void Calculate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println("Enter sec number");
        int sec = sc.nextInt();
        System.out.println("Enter operation (+,-,:,*)");
        String op = sc.next();
        int result;
        switch(op){
            case "+":
                 result = num + sec;
                System.out.println("The result is: " + result);
                break;
            case "-":
                 result = num - sec;
                System.out.println("The result is: " + result);
                break;
            case ":":
                if (num == 0 || sec == 0){
                    System.out.println("na 0 delit nelzia");
                } else {
                    result = num / sec;
                    System.out.println("The result is: " + result);
                    break;
                }
            case "*":
                 result = num * sec;
                System.out.println("The result is: " + result);
                break;
        }
    }
}
