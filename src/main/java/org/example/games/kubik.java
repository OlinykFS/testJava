package org.example.games;
import java.util.Scanner;
import java.util.Random;
public class kubik {
    public void kubikDice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kolichestvo of kubik (3-10)");
        int kolichestvo = sc.nextInt();
        if(kolichestvo < 3 || kolichestvo > 10){
            System.out.println("Invalid kolichestvo");
            return;
        }
        Random rand = new Random();

        int sum = 0;

        System.out.println("Dice Result");

        for(int i = 0; i < kolichestvo; i++){
            int value = rand.nextInt(6) + 1;
            sum += value;
            System.out.println("Kubik " + (i + 1) + ": " + value);
        }
        System.out.println("Sum: " + sum);
        System.out.println("Press Enter to continue");
        sc.nextLine();
        sc.nextLine();
    }
}
