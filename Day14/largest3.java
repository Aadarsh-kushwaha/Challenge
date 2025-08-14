package Day14;

class Solution {
    public String largestGoodInteger(String nums) {
        String ans = "";
        
        for (int i = 0; i <= nums.length() - 3; i++) {
            if (nums.charAt(i) == nums.charAt(i+1) && nums.charAt(i) == nums.charAt(i+2)) {
                String triple = nums.substring(i, i+3);
                if (triple.compareTo(ans) > 0) {
                    ans = triple;
                }
            }
        }
        
        return ans;
    }
}
