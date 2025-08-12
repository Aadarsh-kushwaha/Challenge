package Day13;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder(); // Efficient for string building
        int a = 0, b = 0;
        int w1 = word1.length();
        int w2 = word2.length();

        // Merge characters alternately
        while (a < w1 && b < w2) {
            s.append(word1.charAt(a++)); // Add from word1
            s.append(word2.charAt(b++)); // Add from word2
        }

        // Add remaining characters from word1
        while (a < w1) {
            s.append(word1.charAt(a++));
        }

        // Add remaining characters from word2
        while (b < w2) {
            s.append(word2.charAt(b++));
        }

        return s.toString();
    }
}
