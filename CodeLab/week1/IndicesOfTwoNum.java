package week1;

// Two Sum Problem: Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.

public class IndicesOfTwoNum {
    public static int[] indicesOfTwoNum(int[] arr, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }

        // check the case if there are no sum of two nums equals to the target,
        // return (0, 0) may cause confusion.
        if (indices[0] == 0 && indices[1] == 0) {
            indices[0] = -1;
            indices[1] = -1;
        }

        return indices;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};  // test
        int target = 20;
        int[] indices = indicesOfTwoNum(arr, target);
        for (int i = 0; i < 2; i++) {
            System.out.print(indices[i] + " ");
        }
    }
}
