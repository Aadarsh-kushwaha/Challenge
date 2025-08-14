package Day7;


class findpivotindex {
    public int pivotIndex(int[] nums) {
        int s=0;
        int ts = Arrays.stream(nums).sum();
        for(int i=0;i<nums.length;i++){
            if(s==(ts-nums[i]-s)){
                return i;
            }
          s = s+nums[i];
             
        }

        return -1;
    }
}