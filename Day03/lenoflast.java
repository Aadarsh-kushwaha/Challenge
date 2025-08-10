package Day03;

class Solution {
    public int lenOflast(String s) {
        int l = s.length() - 1;
        int ans = 0;

        // Skip trailing spaces
        while (l >= 0 && s.charAt(l) == ' ') {
            l--;
        }

        // Count the length of the last word
        while (l >= 0 && s.charAt(l) != ' ') {
            ans++;
            l--;
        }

        return ans;
    }
}
