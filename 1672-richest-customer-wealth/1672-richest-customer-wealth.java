class Solution {
    public int maximumWealth(int[][] a) {
        int sum=0;
        int max=0;
        int l=a[0].length;
     for(int i=0;i<a.length;i++){
        for(int j=0;j<l;j++){
            sum=sum+a[i][j];
        }
         if(sum>max){
            max=sum;
        }
        sum=0;
     } 
     return max;  
    }
}