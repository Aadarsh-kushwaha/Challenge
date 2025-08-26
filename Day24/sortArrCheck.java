package Day24;

public class sortArrCheck {
    public static void check(int[] arr,int i){
        if(i==arr.length-1){
            System.out.println("yess it is sorted");
            return ;
        }
        if(arr[i]<=arr[i+1]){
            check(arr,i+1);
        }
        else{
            System.out.println("NO its not sorted ");
            return ;
        }


    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,45,6,};
        check(arr,0);
        
    }
}
