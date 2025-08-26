package Day25;

public class xToThePowerN {
    public static int power(int x, int n) {
        if (n == 0) { // base case 1
            return 1;
        }
        if (n == 1) { // base case 2
            return x;
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(5, 3)); // 125

    }
}
