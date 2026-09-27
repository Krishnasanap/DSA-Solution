class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        int evendigit=0;
        int x;
        for(int i=0;i<nums.length;i++){
            x=nums[i];
            while(x>0){
                x=x/10;
                count++;
            }
            if(count%2==0){
                evendigit++;
            }
            count=0;
        }
        return evendigit;
    }
}