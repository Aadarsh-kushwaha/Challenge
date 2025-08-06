package Day7;


class thirdmax {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int same=1;//TOTAL KITNE NEW DISTINCT 
        int prev = nums[nums.length -1];
        for(int i=nums.length - 2;i>=0;i--){
           if(nums[i]!=prev){   // JAB KOI NEW NUMBER DETECT HO JAYE  
            prev=nums[i];
            same+=1;
           }
           if(same ==3){  // JAISE HI 3 DISTINCT NUMBER MILE  
            return nums[i];
           }
        }
        return nums[nums.length -1];
    }
}