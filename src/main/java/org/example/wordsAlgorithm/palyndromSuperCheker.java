package org.example.wordsAlgorithm;

public class palyndromSuperCheker {
    public boolean palyndromSuper(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right){
            while (left < right && !Character.isLetterOrDigit(word.charAt(left))){
                left ++;
            }
            while (left < right && !Character.isLetterOrDigit(word.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(word.charAt(left)) != Character.toLowerCase(word.charAt(right))){
                return false;
            }
            left ++;
            right--;
        }
        return true;
    }
}