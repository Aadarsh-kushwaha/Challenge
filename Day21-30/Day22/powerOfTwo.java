class Solution {
     public boolean isPowerOfTwo(int n) {
    //     int c =0;
    //     while(n>0){
    //         if((n&1)!=0){
    //             c++;
    //         }
    //         n=n>>1;
    //     }
    //     if(c==1){
    //         return true;
    //     }
    //     return false;
        


        if(n<0){

         return false;
        }
          if(n==0){

         return false;
        }

        if((n & (n-1))==0){

         return true;
        }

return false;
    }
}