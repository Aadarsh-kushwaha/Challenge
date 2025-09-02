class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] arr = new int[score.length];

        for(int i=0;i<arr.length;i++){
            arr[i] = score[i];
        }

        Arrays.sort(arr);
        // ANS ARRAY CREATION 
        String[] ans = new String[arr.length];
            int c = 1; //COUNT FOR RANKES
            for(int i=arr.length-1;i>=0;i--){
              for(int j=0;j<arr.length;j++){
                if(  arr[i]==score[j]){

               


                    if(c==1){
                        ans[j]="Gold Medal";
                        c++;
                        break ;
                    }
                     if(c==2){
                        ans[j]="Silver Medal";
                        c++;
                        break ;
                    }
                     if(c==3){
                        ans[j]="Bronze Medal";
                        c++;
                        break ;
                    }
                     ans[j] = String.valueOf(c);
                     c++;


                }
              
            }
        }

        
        return ans ;
    }
}