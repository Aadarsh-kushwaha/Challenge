package Day4;


class missingnu {
    public int missingNumber(int[] nums) {
     int ac=0,sum = 0;
     int i=0;
     int n = nums.length;
  for( i=0;i<=n - 1; i++){
   
    sum+=nums[i];
  }

  

  ac=n * (n+1)/2;
    return ac-sum;
    }
}
