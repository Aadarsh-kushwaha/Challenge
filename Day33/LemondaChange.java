class Solution {
    public boolean lemonadeChange(int[] arr) {
      int i=0;  
      int a=0;
      int b=0;
    while(i<arr.length){
        if(arr[i]==5){
            a++;
        }
          if(arr[i]==10){
           if(a>0){
            a--;
            b++;
           }else{
            return false;
           }
        }
        if(arr[i]==20){
            if(b>0 && a>0){
                a--;
                b--;
            }
           else if(a>=3){
                a-=3;
            }
            else {
                return false;
            }
        }
i++;
    }
return true;
    }
}