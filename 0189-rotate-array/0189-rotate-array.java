class Solution {
    public void reverse(int[] nums,int i,int j){
            while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i+=1;
            j-=1;
        }
    }
    public void rotate(int[] nums, int k) {
        int i =0, j = nums.length -1;
        int n = nums.length;
        k = k%n;
       reverse(nums,i,j);
        reverse(nums,0,k-1);
        reverse(nums,k,j);
       
        // int o = k;
       
        
    }
}