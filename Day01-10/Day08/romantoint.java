package Day8;


class tomantoint {
    public int romanToInt(String s) {
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int value = getValue(s.charAt(i));
            
            // Check if previous value is smaller → subtraction case
            if (i > 0 && getValue(s.charAt(i - 1)) < value) {
                ans += value - 2 * getValue(s.charAt(i - 1));
            } else {
                ans += value;
            }
        }

        return ans;
    }

    // Helper function to get value of Roman characters
    private int getValue(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
