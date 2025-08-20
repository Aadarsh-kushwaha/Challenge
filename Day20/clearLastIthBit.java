package Day20;

public class clearLastIthBit {
    public static int clearIBits(int n,int i){
        int bitmask = (~0)<<i;
        return  n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearIBits(15, 2));
    }
}
