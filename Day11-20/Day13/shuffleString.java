package Day13;


class Solution {
    public String restoreString(String s, int[] indices) {

        char[] ans = new char[s.length()]; // char[] banaya
        for (int i = 0; i < ans.length; i++) {
            ans[indices[i]] = s.charAt(i); // correct mapping
        }

        return new String(ans); // char[] → String
    }
}
