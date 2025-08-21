package Day15;
class  {
    public boolean CheckStrPalindrome(String s) {

        String clean = "";
        // Step 1: Remove non-alphanumeric chars
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if ((curChar >= '0' && curChar <= '9') || 
                (curChar >= 'a' && curChar <= 'z') || 
                (curChar >= 'A' && curChar <= 'Z')) {
                clean += curChar;
            }
        }

        // Step 2: Convert to lowercase
        clean = clean.toLowerCase();

        // Step 3: Check palindrome using two pointers
        int start = 0;
        int end = clean.length() - 1;

        while (start < end) {
            if (clean.charAt(start) != clean.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
