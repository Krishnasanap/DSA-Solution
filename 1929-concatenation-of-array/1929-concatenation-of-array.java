class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
      int[] con=new int[n*2];
      for(int i=0;i<nums.length;i++){
        con[i]=nums[i];
        con[n]=nums[i];
        n++;
      }
      return con;  
    }
}