import java.util.*;
class Solution {
    //2 0 2 1 1 0
    public void sortColors(int[] nums) {
      int red=0;
       int white=0;
       int blue=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            red++;
        }else if(nums[i]==1){
            white++;
        }else{
            blue++;
        }
       }
    int i=0;
    int j=0;
        while(j<red){
            nums[i]=0;
            i++;
            j++;
        }
        j=0;
        while(j<white){
            nums[i]=1;
            i++;
            j++;
        }
        j=0;
        while(j<blue){
            nums[i]=2;
            i++;
            j++;
        }
    }
}