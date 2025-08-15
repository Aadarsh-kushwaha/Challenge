package Day15;
import java.util.Arrays;


public class RotateByK {

    static void reverse(int[] nums, int a, int b) {
        while (a <= b) {
           int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
            a++;
            b--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        k = k % nums.length;  // in case k > length

        // Step 1: Reverse entire array
        reverse(nums, 0, nums.length - 1);
        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse remaining elements
        reverse(nums, k, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }
}
