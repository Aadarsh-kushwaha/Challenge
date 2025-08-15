package Day15;

public class AddBin {
    public static void main(String[] args) {
        String a = "11", b = "1";

        int m = a.length();
        int n = b.length();
        int max = Math.max(m, n);
        int carry = 0;

        int[] ans = new int[max];
        int i = 0;

        while (i < max) {
            int bitA = 0;
            int bitB = 0;

            // bitA nikalna
            if (m - i - 1 >= 0) {
                bitA = a.charAt(m - i - 1) - '0';
            }

            // bitB nikalna
            if (n - i - 1 >= 0) {
                bitB = b.charAt(n - i - 1) - '0';
            }

            // sum nikalo
            int sum = bitA + bitB + carry;

            // current bit store karo
            ans[max - i - 1] = sum % 2;

            // carry update karo
            if (sum >= 2) {
                carry = 1;
            } else {
                carry = 0;
            }

            i++;
        }

        // result string banana
        StringBuilder str = new StringBuilder();
        if (carry == 1) {
            str.append(1);
        }
        for (int bit : ans) {
            str.append(bit);
        }

        System.out.println(str.toString()); // Output: 100
    }
}
