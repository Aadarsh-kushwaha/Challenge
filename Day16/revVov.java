class Solution {
    // Swap function for StringBuilder
    static void swap(StringBuilder sb, int l, int r) {
        char temp = sb.charAt(l);
        sb.setCharAt(l, sb.charAt(r));
        sb.setCharAt(r, temp);
    }

    // Check if a character is vowel
    static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int l = 0, r = sb.length() - 1;

        while (l < r) {
            if (!isVowel(sb.charAt(l))) {
                l++;
                continue;
            }
            if (!isVowel(sb.charAt(r))) {
                r--;
                continue;
            }
            // swap vowels
            swap(sb, l, r);
            l++;
            r--;
        }
        return sb.toString();
    }
}
