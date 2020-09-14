package week1;

// Is Unique: Implement an algorithm to determine if a string has all unique characters.

public class AllUnique {
    public static boolean isUnique(String s) {
        boolean isUnique = true;

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
        }
        return isUnique;
    }

    public static void main(String[] args) {
        String s = "ABCDEFGHIJgXD"; //test
        System.out.println(isUnique(s));
    }
}
