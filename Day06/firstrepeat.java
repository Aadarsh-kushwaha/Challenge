package Day6;
import java.util.*;

public class firstrepeat {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 1, 2, 3}; // Example input

        Set<Integer> seen = new HashSet<>();

        for (int i=0;i<nums.length;i++) {
            if (seen.contains(nums[i])) {
                System.out.println("First repeating element is: " + nums[i]);
                return;
            }
            seen.add(nums[i]);
        }

        System.out.println("No repeating element found.");
    }
}
