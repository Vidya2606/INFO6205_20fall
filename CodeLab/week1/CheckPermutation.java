package week1;

// Check Permutation: Given two strings, write a method to decide if one is a permutation of the other

import java.util.HashMap;

public class CheckPermutation {
    public static boolean isPermutation(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            if (!map1.containsKey(s1.charAt(i))) {
                map1.put(s1.charAt(i), 1);
            } else {
                int value = map1.get(s1.charAt(i));
                map1.put(s1.charAt(i), value + 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (!map2.containsKey(s2.charAt(i))) {
                map2.put(s2.charAt(i), 1);
            } else {
                int value = map2.get(s2.charAt(i));
                map2.put(s2.charAt(i), value + 1);
            }
        }

        if (map1.size() != map2.size()) {
            return false;
        }

        for (char c : map1.keySet()) {
            if (!map2.containsKey(c)) {
                return false;
            } else {
                int value1 = map1.get(c);
                int value2 = map2.get(c);
                if (value1 != value2) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "ABABCD";
        String s2 = "ABABDC";
        System.out.println(isPermutation(s1, s2));
    }

}
