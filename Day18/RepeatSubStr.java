package Day18;
public class RepeatSubStr {
    public static void main(String[] args) {
      String str = "abcabcabcabc";
        int len= str.length();
        
        for(int i=0;i<len/2;i++){
            for(int j=0;j<len;j++){

                  if(str.charAt(i)!=str.charAt(j%len)){
              
                    break ;
                }
            
            if(str.charAt(i)==str.charAt(j%len)){
                if(j==len-1){
                  System.out.println("TRUE");
                }
            }
            }
        }
        
        
        System.out.println("END");
        return;
    }
}
   