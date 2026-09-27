class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     ArrayList<Boolean> list = new ArrayList<>();
     int large=0;

   for(int i=0;i<candies.length;i++){
    if(candies[i]>=large){
        large=candies[i];
    }
   }
   for(int i=0;i<candies.length;i++){
    if((candies[i]+extraCandies)>=large){
        list.add(true);
    }
    else{
        list.add(false);
    }
   }
   return list;
    }
}