package Day45;

import java.util.Stack;

public class reverseAString {
    public static void reverse(String str){
           Stack<Character> s = new Stack<>();
           int idx = 0;
           // Storing into the stack 
           while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
           }

           StringBuilder result = new StringBuilder("");
           while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
           }
           System.out.println(result);


    }
    public static void main(String[] args) {
     
        reverse("abcd");
    }
}
