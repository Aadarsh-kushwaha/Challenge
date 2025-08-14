package Day9;


public class DiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13,14, 15, 16}
        };

        int pd = 0;
        int sd=0;
        int i=0;
        int j=0;
        while(i<arr.length){
            pd =pd + arr[i][j];
            i++;
            j++;
        }
        j--;
        i=0;
        while(j>=0){
            sd=sd + arr[i][j];
            i++;
            j--;
        }

        System.out.println("Primary Sum :" + pd+" "+"Secondary sum:"+ sd);
}
    }
     
