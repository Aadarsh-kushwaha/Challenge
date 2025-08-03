package Day2.Day3;


class Solution {
    public int lengthOflast(String s) {
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

