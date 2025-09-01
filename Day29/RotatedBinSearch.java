package Day29;

public class RotatedBinSearch {
    public static int search(int[] arr , int s , int e, int t){
        if(s > e){
            return -1;  // target not found
        }
        int m = s + (e-s)/2;

        if(arr[m] == t){
            return m;
        }

        // Check if left half is sorted
        if(arr[s] <= arr[m]){
            // Target lies in left half
            if(t >= arr[s] && t < arr[m]){
                return search(arr, s, m-1, t);
            } else {
                return search(arr, m+1, e, t);
            }
        } 
        // Otherwise right half is sorted
        else {
            if(t > arr[m] && t <= arr[e]){
                return search(arr, m+1, e, t);
            } else {
                return search(arr, s, m-1, t);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int result = search(arr,0,arr.length-1,target);

        if(result != -1){
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found!");
        }
    }
}
