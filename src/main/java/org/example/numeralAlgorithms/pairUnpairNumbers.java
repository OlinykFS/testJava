package org.example.numeralAlgorithms;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class pairUnpairNumbers {
    public void checkPairUnpairNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the array length: ");
        int length = sc.nextInt();
        int[] arr = new int[length];

        System.out.println("Enter "+ length + " numbers for array");
        for(int i = 0; i < length; i++){
            System.out.println("Ostalos: " + (length - i));
            arr[i] = sc.nextInt();
        }
        List<Integer> pair = new ArrayList<>();
        List<Integer> unpair = new ArrayList<>();

        for (int num : arr){
            if (num % 2 == 0){
                pair.add(num);
            } else {
                unpair.add(num);
            }
        }
        System.out.println("pair" + pair + " Kolichestvo " + pair.size());
        System.out.println("unpairn" + unpair + " Kolichestvo " + unpair.size());
    }
}
