class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> numSet1 = new HashSet<>();
        Set<Integer> numSet2 = new HashSet<>();

        for(int i=0; i<nums1.length; i++){
            numSet1.add(nums1[i]);
        }

        for(int j=0; j<nums2.length; j++){
            if(numSet1.contains(nums2[j])){
                numSet2.add(nums2[j]);
                numSet1.remove(nums2[j]);
            }
        }
        
        int[] result = new int[numSet2.size()];
        int k=0;
        for(Integer num : numSet2){
            result[k++]=num;
        }

        return result;    
    }   
}