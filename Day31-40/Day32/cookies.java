import java.util.*;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);  // sort children greed
        Arrays.sort(s);  // sort cookies size

        int i = 0; // child pointer
        int j = 0; // cookie pointer

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {  
                // cookie j child i ko satisfy kar rahi
                i++;
            }
            j++; // next cookie check karo
        }
        return i;  // satisfied children count
    }
}
