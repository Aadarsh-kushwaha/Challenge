public class prtRevNum {
    public static void recurDec(int n){
        if(n==0){
           System.out.println("0");
           return ;
        }
        else{
            System.out.print(n+" ");
            recurDec(n-1);
        }
    }

    public static void recurInc(int n){
        if(n==0){
            System.out.print(n+" ");
            return ;
        }
        recurInc(n-1);
        System.out.print(n+" ");

    }


    public static void main(String[] args) {
       recurDec(10);
        recurInc(10);
        
    }
}
