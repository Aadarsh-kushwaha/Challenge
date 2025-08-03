package Day3;

class intersection {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[nums2.length];
        for(int i=0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && !visited[j]){
                    ans.add(nums1[i]);
                    visited[j]=true;
                    break ;
                }
            }
        }
      // Convert ArrayList to int[]
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;

    }
}
