package Day45;
import java.util.*;
public class StackJCF {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        while(!s.isEmpty()){
            System.out.print(s.peek());
            s.pop();
        }
    }
    
}
