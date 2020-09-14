package week1;

// Sum of two Strings: Given two non-negative integers num1 and num2 represented as string,
// return the sum of num1 and num2.

public class SumOfTwoStrings {
    public static int sumOfTwo(String s1, String s2) {
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        return num1 + num2;
    }

    public static void main(String[] args) {
        String s1 = args[0];
        String s2 = args[1];

        System.out.println(sumOfTwo(s1, s2));

    }
}
