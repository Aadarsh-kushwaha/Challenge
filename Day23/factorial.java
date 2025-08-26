public class factorial {
public static int fact(int n){
    if(n==1){
        return 1;
    }
    else{
  return n * fact(n - 1); // yaha multiplication hona chahiye
        
    }
}

    public static void main(String[] args) {
        int n=5;
        int fac =n* fact(n-1);
        System.out.println(fac);
    }
}
