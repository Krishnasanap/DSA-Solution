class Solution {
    public int majorityElement(int[] nums) {
        //this is  my solution using mores voting algorithm
      int ele=0;
      int count=0;
      for(int i=0;i<nums.length;i++){
        if(count==0){
            count++;
            ele=nums[i];
        }else if(ele==nums[i]){
            count++;
        }else{
            count--;
        }
      }
      int cn=0;  
      for(int j=0;j<nums.length;j++){
if(nums[j]==ele){
    cn++;
}
      }
      if(cn>nums.length/2){
        return ele;
      }
      return -1;
    }
}