class Solution {
    public int[] rearrangeArray(int[] nums) {
          int x=0;
        int y=0;
        int[] positive=new int[nums.length/2];
        int[] negative=new int[nums.length/2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                positive[x]=nums[i];
                x++;
            }else{
                negative[y]=nums[i];
                y++;
            }
        }
        x=0;
        y=0;
        for(int j=0;j<nums.length;j+=2){
nums[j]=positive[x];
x++;
        }
        for(int k=1;k<nums.length;k+=2){
nums[k]=negative[y];
y++;
        }
        return nums; 
    }
}