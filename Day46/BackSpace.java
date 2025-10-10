class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> s1 = new Stack<>();
          Stack<Character> s2 = new Stack<>();

        // process first string
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!s1.isEmpty()) s1.pop(); // check to avoid EmptyStackException
            } else {
                s1.push(c);
            }
        }

        // process second string
        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (!s2.isEmpty()) s2.pop();
            } else {
                s2.push(c);
            }
        }
        StringBuilder sb1 = new StringBuilder() ;
        StringBuilder sb2 = new StringBuilder() ;
       

          while (!s1.isEmpty()) sb1.append(s1.pop());
        while (!s2.isEmpty()) sb2.append(s2.pop());

        return sb1.toString().equals(sb2.toString());
        
    }
}