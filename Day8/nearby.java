package Day8;


class nearby {
    public static void containsNearbyDuplicate(int[] nums, int k) {

        for(int i=0;i<=nums.length-3;i++){
            for(int j=i+1;j <= i + k && j < nums.length;j++){
                if(nums[i]==nums[j]){
                    System.out.println("true");
                }
            }
        }

   System.out.println("FaLSE");
    }
    public static void main(String[] args) {
        int nums[] ={1,2,3,1};
        int k=3;
    containsNearbyDuplicate(nums,k);
    }
}