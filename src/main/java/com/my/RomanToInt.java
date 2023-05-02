package com.my;

import java.util.HashMap;

public class RomanToInt {
    public static int romanToInt(String input) {
        int result = 0;
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        for (int i = 0; i < input.length(); i++) {
            if (i < input.length() - 1 && romanMap.get(input.charAt(i)) < romanMap.get(input.charAt(i + 1))) {
                result -= romanMap.get(input.charAt(i));
            } else {
                result += romanMap.get(input.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("XII"));
    }
}
