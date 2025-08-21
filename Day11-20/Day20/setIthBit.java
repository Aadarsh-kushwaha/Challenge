
package Day20;

// yaha pe jis bit ko hame 1 set krna hai us place ko OR operator ke sath solve agar 0 hoga toh 1 ho jayega otherwise 1 toh rhna hi haii 
public class setIthBit {
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;   // ith position pe mask
        return n | bitMask;     // OR karke bit set
    }

    public static void main(String[] args) {
        System.out.println(setIthBit(6, 0)); // output: 7
    }
}
