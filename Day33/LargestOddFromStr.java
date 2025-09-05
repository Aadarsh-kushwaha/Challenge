class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 != 0) {   // odd check
                return num.substring(0, i + 1);     // include i-th index
            }
        }
        return "";
    }
}
