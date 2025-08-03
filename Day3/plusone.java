package Day3;


class plusone {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;

        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] >= 10) {
                digits[i] %= 10;
                digits[i - 1] += 1;
            } else {
                // No carry needed, return early
                return digits;
            }
        }

        // Check if carry is needed at the highest digit
        if (digits[0] >= 10) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            digits[0] %= 10;
            for (int i = 0; i < digits.length; i++) {
                result[i + 1] = digits[i];
            }
            return result;
        }
        

        return digits;
    }
}
