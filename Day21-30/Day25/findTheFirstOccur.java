package Day25;

public class findTheFirstOccur {
    public static void occur(int[] arr,int k,int s){
        if(s==arr.length){
            System.out.println("NOT PRESENT IN THE ARRAY");
            return ;
        }
        if(arr[s]==k){
            System.out.println(s);
            return ;
        }
        occur(arr, k, s+1);
    }
    public static void occurLast(int[] arr,int k,int i){
        if(arr[i]==k){
            System.out.println(i);
            return ;
        }
        if(i==0){
            System.out.println("NOT AVAILABLE");
            return; 
        }
        occurLast(arr, k,i-1);


    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,5,45,84,19};
       // occurFir(arr,1,0);
        occurLast(arr, 5, arr.length-1);
    }
}
