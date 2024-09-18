package org.example.numeralAlgorithms;

import java.util.HashMap;

public class UniqueSum {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0)+ 1);
        }
        int sum = 0;
        for(int num : countMap.keySet()){
            if(countMap.get(num) == 1){
                sum += num;
            }
        }
        return sum;
    }
}
