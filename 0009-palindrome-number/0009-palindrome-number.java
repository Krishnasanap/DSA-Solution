class Solution {
    public boolean isPalindrome(int x) {
        int num=Math.abs(x);
        int lastdigit;
        int rev=0;
        if(x<0){
            return false;
        }
       while(num>0){
            lastdigit=num%10;
             if (rev > (Integer.MAX_VALUE - lastdigit) / 10) {
                return false;  
            }
        num=num/10;
            rev=rev*10+lastdigit;
        }
        if(rev==x){
            return true;
        }else{
            return false;
        } 
        
    }
}