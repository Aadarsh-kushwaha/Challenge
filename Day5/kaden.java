package Day5;
public class kaden{
    public static void kadens(int nums[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int num : nums){
            cs = cs+ num;
            if(cs<0){
                cs= 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Our max sub array is: "+ ms);
    }

    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadens(numbers);
    }
} 
