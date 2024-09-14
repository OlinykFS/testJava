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
        String op = sc.nextLine();

        switch(op){
            case "+":
                int result = num + sec;
                System.out.println("The result is: " + result);
                break;
            case "-":
                result = num - sec;
                System.out.println("The result is: " + result);
                break;
            case ":":
                result = num / sec;
                System.out.println("The result is: " + result);
                break;
            case "*":
                result = num * sec;
                System.out.println("The result is: " + result);
                break;
        }
    }
}
