class Solution {
    public int majorityElement(int[] nums) {
      // krushna sanap
      //this solution is solved using hashmap
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }
      for(Integer key : map.keySet()){
        if(map.get(key)>nums.length/2){
            return key;
        }
      }  
      return -1;
    }
}