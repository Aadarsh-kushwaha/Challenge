package Day11;

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] arr = new int[image.length][image.length];
        int k=0;
        for(int i=0;i<image.length;i++){
            for(int j=image[i].length-1;j>=0;j--){
                if(image[i][j]==0){
                    arr[i][k]=1;
                    k++;
                }
                else{
                      arr[i][k]=0;
                      k++;
                }
            }
            k=0;
        }
    return arr;
    }
}