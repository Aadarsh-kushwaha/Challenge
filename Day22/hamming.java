class Solution {
    public int hammingDistance(int x, int y) {
        int d = 0;
        while (x > 0 || y > 0) {
            if ((x & 1) != (y & 1)) {  // compare last bits directly
                d++;
            }
            x >>= 1;
            y >>= 1;
        }
        return d;
    }
}
