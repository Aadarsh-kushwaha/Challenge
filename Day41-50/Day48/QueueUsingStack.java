package Day48;

import java.util.Stack;

public class QueueUsingStack {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("already empty");
                return -1;
            }
           return  s1.pop();
        }
        public static int peek(){
             if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
           return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}




import java.util.Stack;

class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        // Move all elements from s1 to s2
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // Push new element into s1
        s1.push(x);

        // Move all elements back to s1 from s2
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }
    
    public int pop() {
        if(s1.isEmpty()) {
            return -1; // or throw exception
        }
        return s1.pop();
    }
    
    public int peek() {
        if(s1.isEmpty()) {
            return -1;
        }
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}
