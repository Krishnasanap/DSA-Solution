class Solution {
    public void rotate(int[][] m) {
        //this is brute force apporoach which takes the extra matrix to  store the element
        int[][] mat = new int[m.length][m[0].length];
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                mat[j][m.length-1-i]=m[i][j];
            }
        }
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m.length;j++){
                m[i][j]=mat[i][j];
            }
        }
    }
}