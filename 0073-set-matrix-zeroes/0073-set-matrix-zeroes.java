class Solution {
    public void setZeroes(int[][] m) {
        ArrayList<Integer> list=new ArrayList<>();
        int top = 0;
        int left = 0;
        int bottom = m.length;
        int right = m[0].length;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] == 0) {
                    list.add(i);
                    list.add(j);
            }
        }
    }
    for(int i=0;i<list.size();i+=2){
        while (left < right) {
                        m[list.get(i)][left] = 0;
                        left++;
                    }
                    while (top < bottom) {
                        m[top][list.get(i+1)] = 0;
                        top++;
                    }
                left=0;
                top=0;
        }
    }
}