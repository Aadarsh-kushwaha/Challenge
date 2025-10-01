package Day24;

public class fibonaci {
    public static int fibo(int n){
        int sum =0;
        if(n==0 || n==1){
            return n;
        }
        else{
          
            sum =fibo(n-2)+fibo(n-1);
        }
        return sum;
    }

 public static void main(String[] args) {
    int n=5;
    int fib = fibo(n);
    System.out.println(fib);
 }   
}
