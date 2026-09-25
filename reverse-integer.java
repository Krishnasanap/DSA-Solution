//reversing the number
class Solution {
    public int reverse(int x) {
        int num=Math.abs(x);
        int lastdigit;
        int rev=0;
        while(num>0){
            lastdigit=num%10;
             if (rev > (Integer.MAX_VALUE - lastdigit) / 10) {
                return 0;  
            }
        num=num/10;
            rev=rev*10+lastdigit;
        }
        return (x<0)?(-rev):rev;
    }
}
