package Day16;

public class firstNonReapeat {
   public static void main(String[] args) {
      String s = "loveleetcode";
              int count =0;
        for(int i = 0;i<s.length();i++){
            // char ch = s.charAt(i);
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(i);
                return ;
            }
            count=0;
        }
  System.out.println("-1");
   }
}
