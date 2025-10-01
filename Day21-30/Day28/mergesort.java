package Day28;

import java.util.Arrays;

public class mergesort {
    public static void mergsort(int[] arr,int si ,int en){
        if(si>=en){
            return ;
        }
        int mid = si + (en - si)/2;
        mergsort(arr, si, mid);
        mergsort(arr, mid+1, en);
        merge(arr,si,mid,en);
    }
    public static void merge(int[] arr,int si ,int mid,int en){
        int[] arr1 =  new int[en - si + 1]; 
        int i = si;
        int j = mid+1;
        int k=0;
        while(i<=mid && j<=en){
int temp ;
            if(arr[i]<=arr[j]){
              arr1[k]=arr[i];
              i++;
            
            }
            else{
                 arr1[k]=arr[j];
                 j++ ;
            
            }
      k++;
        }
        while(i<=mid){
            arr1[k++]=arr[i];
            i++;
        }
         while(j<=en){
            arr1[k++]=arr[j];
            j++ ;

        }
        // Copy temp back into arr
        for (int m = 0; m < arr1.length; m++) {
            arr[si + m] = arr1[m];
        }


    }


    public static void main(String[] args) {
        int[] arr = {1,5,3,88,45,22,21,12};
        mergsort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
