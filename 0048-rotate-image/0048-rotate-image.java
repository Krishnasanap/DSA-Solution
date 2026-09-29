class Solution {
    public void rotate(int[][] m) {
          //this is the optimal solution for rottating the array
        //first i tronspose the array then i reverse each column
      for(int i=0;i<m.length-1;i++){
        for(int j=i+1;j<m.length;j++){
            if(i!=j){
                int temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }
      }
      //reverse a matrix 
      int k=0;
      int n=m[0].length-1;
      for(int i=0;i<m.length;i++){
        while(k<n){
            int temp=m[i][k];
            m[i][k]=m[i][n];
            m[i][n]=temp;
            k++;
            n--;
        }
         k=0;
       n=m[0].length-1;
      }
           }
}