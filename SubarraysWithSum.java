package Day1;

public class SubarraysWithSum {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int ts=0;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i;j<=arr.length-1;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+ " ");
                    sum = sum + arr[k];
                }
                System.out.println("     The sum is : "+sum);
                ts++;
               
            }
            System.out.println();
           
        }
        System.out.println("Total number of sub Array is :" + ts);
    }
    
}
