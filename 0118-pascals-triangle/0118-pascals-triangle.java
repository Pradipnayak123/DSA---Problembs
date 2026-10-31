class Solution {
    public List<Integer> genrateRow(int row){
        int ans = 1;
        List<Integer>ansRow = new ArrayList<>();
        ansRow.add(1);
        for(int i=1;i<row;i++){
            ans = ans*(row-i);
            ans = ans/i;
            ansRow.add(ans);

        } 
        return ansRow;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
             res.add(genrateRow(i));
        }
        return res;
    }
}