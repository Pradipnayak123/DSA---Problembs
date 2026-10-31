class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length; // coloum
        int n = matrix[0].length; // rows
        int top = 0;
        int left  = 0;
        int right = n-1;
        int bot = m-1;
        List<Integer> res = new ArrayList<>();
        while(top<=bot && left<=right){

        
            //Right 
            for(int i=left;i<=right;i++){
                res.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bot;i++){
                res.add(matrix[i][right]);
            }
            right--;
            if(top<=bot){

            
            for(int i=right;i>=left;i--){
                res.add(matrix[bot][i]);
            }
            bot--;
            }
            if(left<=right){

            for(int i=bot;i>=top;i--){
                res.add(matrix[i][left]);
            }

          left++;
            }
        }
        return res;  

        
    }
}