class Solution {
    public int longestPalindrome(String s) {

        int[] arr = new int[128];
        for(char c:s.toCharArray()){
            arr[c]++;
        }
        int c=0;
        boolean odd=false;

        for(int num:arr){
            if(num%2==0){
                c=c+num;
            }
            else{
                c = c+ (num-1);
                odd = true;
            }
        }
        if(odd)  c++;
        return c;

        
    }
}