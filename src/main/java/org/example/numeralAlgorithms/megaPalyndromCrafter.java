package org.example.numeralAlgorithms;

public class megaPalyndromCrafter {
    public String shortestPalidrome(String s) {
        if(s == null || s.length() < 2){
            return s;
        }
        String reversed = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + reversed;

        int[] lps = new int[combined.length()];
        computeLPSArray(combined, lps);

        int maxPalindrome = lps[lps.length - 1];

        String toAdd = reversed.substring(0, s.length() - maxPalindrome);
        return toAdd + s;
    }
    private void computeLPSArray(String s, int[] lps) {
        int len = 0;
        int i = 1;
        while (i < s.length()) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if(len != 0){
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

}
