package Day20;

public class getBit {
    public static int getIthBit(int n,int i){
        int bitMask = 1<<i;
        if((n & bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }



    }
    public static void main(String[] args) {
        int n = 1011000;
        int i = 3;

       int ans =  getIthBit(10,i);
       System.out.println(ans);
    }

}
