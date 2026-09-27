class Solution {
    public int[] shuffle(int[] nums, int n) {
      int[] arr=new int[nums.length];
      int x=0;
      for(int i=0;i<nums.length/2;i++){
        arr[x]=nums[i];
        x++;
        arr[x]=nums[n];
        x++;
        n++;
      }
return arr;
    }
}