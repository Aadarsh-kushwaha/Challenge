package Day2;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};

        // Step 1: Create Prefix Sum array
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Step 2: Find max subarray sum using prefix sum
        int maxSum = 0;
        int x = 0, y = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (sum > maxSum) {
                    maxSum = sum;
                    x = i;
                    y = j;
                }
            }
        }

        // Step 3: Print result
        System.out.print("Max Subarray: ");
        for (int i = x; i <= y; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nMax Sum: " + maxSum);
    }
}
