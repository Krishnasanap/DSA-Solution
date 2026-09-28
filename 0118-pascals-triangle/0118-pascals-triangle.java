class Solution {
    static List<Integer> pascalTriangleII(int r) {
        ArrayList<Integer> list=new ArrayList<>();
        int x=r-1;
int ans=1;
list.add(ans);
for(int j=1;j<r;j++){
for(int i=0;i<j;i++){
    ans=ans*(x-i);
    ans=ans/(i+1);
}
list.add(ans);
ans=1;
}
return list;
    }   
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> list=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            list.add(pascalTriangleII(i));
        }
        return list;
    }
}