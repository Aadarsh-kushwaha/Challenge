
class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> s = new Stack<>();
        int sum = 0;

        for (String op : ops) {
            if (op.equals("C")) {
              
                sum -= s.pop();
            } 
            else if (op.equals("D")) {
              
                int doub = 2 * s.peek();
                s.push(doub);
                sum += doub;
            } 
            else if (op.equals("+")) {
             
                int top = s.pop();
                int newScore = top + s.peek();
                s.push(top);
                s.push(newScore);
                sum += newScore;
            } 
            else {
              
                int num = Integer.parseInt(op);
                s.push(num);
                sum += num;
            }
        }

        return sum;
    }
}