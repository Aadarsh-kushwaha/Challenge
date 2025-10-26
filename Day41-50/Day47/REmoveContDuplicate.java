class Solution {
    public String removeDuplicates(String str) {
        Stack<Character> s = new Stack<>();
         for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // If stack not empty and top is same → remove duplicate
            if (!s.isEmpty() && s.peek() == ch) {
                s.pop();
            } else {
                s.push(ch);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
       

         sb.reverse();
         return sb.toString();
         

    }
}