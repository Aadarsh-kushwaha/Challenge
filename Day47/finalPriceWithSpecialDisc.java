class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        for(int i=0;i<prices.length;i++){
            int curr = prices[i];
           int dis = 0;

            for(int j = i+1 ;j<prices.length;j++){
                if(prices[i]>=prices[j]){
                   // ans[i]=prices[i]-prices[j];
                    dis = prices[j];
                    break ;
                }
            }
            ans[i]=curr-dis;
            dis=0;


           
        }



    return ans;
        
    }
}