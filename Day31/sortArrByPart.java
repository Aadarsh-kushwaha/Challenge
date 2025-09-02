class Solution {
    public int[] sortArrayByParity(int[] nums) {


        int[] ans = new int[nums.length];
        int l = nums.length-1;
        int k =0;
        for(int i=0;i<=l;i++){
            if(nums[i]%2==0){
                ans[k++]=nums[i];
            }
        }

         for(int i=0;i<=l;i++){
            if(nums[i]%2!=0){
                ans[k++]=nums[i];
            }
        }

        return ans ;
    }
}