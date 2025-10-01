package Day28;

import java.util.Arrays;

public class quicksort {
    public static void sort(int[] arr,int si , int ei){
       if(si>=ei){
        return ;
       }
       int pidx = partition(arr,si,ei);
        sort(arr,si,pidx-1);
        sort(arr,pidx+1,ei);
    }
    public static int partition(int[] arr,int si, int ei){
        int p = arr[ei];
        int i = si-1;
        for(int j= si;j<ei;j++){
            if(arr[j]<= p){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp ;

            }

        }
           i++;
                int temp = p;
                arr[ei] = arr[i];
                arr[i] = temp ;
                return i  ;


    }

    public static void main(String[] args) {
        int[] arr = {1,5,7,89,55,12,77};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
