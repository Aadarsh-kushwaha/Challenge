class Solution {
    public char kthCharacter(int k) {
        return solve(k);
    }

    private char solve(int k) {
        // base case: first character is always 'a'
        if (k == 1) return 'a';

        // find length of block >= k
        int length = 1;
        while (length < k) {
            length *= 2;
        }

        int mid = length / 2;

        if (k <= mid) {
            return solve(k); // still in the left half
        } else {
            char c = solve(k - mid); // recurse into left half
            return (c == 'z') ? 'a' : (char)(c + 1); // shift for right half
        }
    }
}
