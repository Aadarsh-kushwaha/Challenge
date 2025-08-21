package Day21;

public class isPowerOfTwo {
    public static boolean  powof2(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] 
    args) {
        System.out.println(powof2(9));
        
    }
}
