package Day4;


class palindrome {
    public boolean Palindrome(int x) {
        
        int a= 0;
        int c=x;
        while(c>0){
            a= (a*10)+ (c%10);
            c =c/10;
        }
        if(a==x){
            return true;
        }
        return false;

    }
}