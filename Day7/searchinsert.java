package Day7;

class searchinsert {
    public int searchInsert(int[] nums, int target) {
        int e=nums.length -1;
        int s = 0;
        int mid = s + (e-s)/2;;
        while(e>=s){ // COMMON MID NUMBER KO BHI CHECK KRENGE 
           
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                e = mid -1;
            }
             if(nums[mid]<target){
                s= mid +1;
            }
     mid = s + (e-s)/2;
        }

    return s;
    }
}