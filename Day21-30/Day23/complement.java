class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0; // initially result = 0

        // Step 1: Loop over every character in s
        for (char c : s.toCharArray()) {
            // result = result ^ c
            // XOR karne se duplicate characters cancel ho jaate hain
            result ^= c;
        }

        // Step 2: Loop over every character in t
        for (char c : t.toCharArray()) {
            // result = result ^ c
            // yaha bhi sab cancel ho jayenge, aur jo extra char hoga wahi bachega
            result ^= c;
        }

        // Step 3: Final result is the extra character
        return result;
    }
}
