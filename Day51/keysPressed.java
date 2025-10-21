
//https://leetcode.com/problems/slowest-key/description/


class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
      int maxDuration = releaseTimes[0];
      char slowest  = keysPressed.charAt(0);
      for(int i=1;i<releaseTimes.length;i++){
        int curr = releaseTimes[i]-releaseTimes[i-1];
        if(curr>maxDuration || curr==maxDuration && keysPressed.charAt(i)>slowest){
            maxDuration = curr;
            slowest =  keysPressed.charAt(i);
        }
      }

      return slowest;
    }
}


