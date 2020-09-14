package week1;

// Rotate and array: Given an array,
// rotate the array to the right by k steps, where k is non-negative.

public class RotateArrayToRightByK {
    public static void rotate(int[] arr, int k) {
        if (k < 0) k = -k;
        int times = k % arr.length;
        while (times > 0) {
            int last = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
            times--;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4}; //test
        rotate(a, 10);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

}
