import java.util.Stack;

public class stackTry {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(4);
        s.add(3);
        s.add(2);
        s.add(1);

        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    
}
