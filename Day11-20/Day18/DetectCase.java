package Day18;

public class DetectCase {
    
    public static void main(String[] args) {
        String w="Dog Bat";

    // Case 1: First letter uppercase and next all lowercase
        if (Character.isUpperCase(w.charAt(0))) {
            if(Character.isLowerCase(w.charAt(1))){

                 for (int i = 0; i < w.length(); i++) {
                if (w.charAt(i) == ' ') {
                    if (Character.isLowerCase(w.charAt(i + 1))) {
                                           return false;
                    }
                }
                if (Character.isLowerCase(w.charAt(i))) {
               
                    return false;
                }
       

         if(Character.isUpperCase(w.charAt(0))){

        for(int i=1;i<w.length();i++){

        if(Character.isLowerCase(w.charAt(i))){
               System.out.println("False");
        }
        }

       }


       if(Character.isLowerCase(w.charAt(0))){

         for(int i=1;i<w.length();i++){
        if(Character.isUpperCase(i)){
              System.out.println("False");
        }
         }

       }




      
      
     
        System.out.println("True");
    }
    

}
