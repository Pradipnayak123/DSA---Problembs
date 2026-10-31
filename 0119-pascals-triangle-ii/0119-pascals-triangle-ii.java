class Solution {
    public long ncr(int n,int r){
        long res = 1;
        for(int i=0;i<r;i++){
            res = res*(n-i);
            res = res/(i+1);
        }
        return res;

    }
    public List<Integer> getRow(int rowIndex) {
        int r = rowIndex+1;
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<=r;i++){
            res.add((int)ncr(r-1,i-1));

        }
        return res;
        
    }
}