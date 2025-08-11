package Day12;
class findTheIndexOf {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        // Edge case: Empty needle
        if (m == 0) return 0;

        // Loop till the last possible starting index
        for (int i = 0; i <= n - m; i++) {
            // Compare substring of length m starting at i
            if (haystack.substring(i, i + m).equals(needle)) {
                return i; // first occurrence found
            }
        }

        return -1; // needle not found
    }
}
