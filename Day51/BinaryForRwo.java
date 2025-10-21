class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        if (nums.length == 0) return ans;

        // Find first occurrence
        int first = findFirst(nums, target);

        // If not found, directly return {-1, -1}
        if (first == -1) return ans;

        // Find last occurrence
        int last = findLast(nums, target);

        ans[0] = first;
        ans[1] = last;

        return ans;
    }

    private int findFirst(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        int index = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                index = mid;
                e = mid - 1;  // move left for first occurrence
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return index;
    }

    private int findLast(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        int index = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                index = mid;
                s = mid + 1;  // move right for last occurrence
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return index;
    }
}
