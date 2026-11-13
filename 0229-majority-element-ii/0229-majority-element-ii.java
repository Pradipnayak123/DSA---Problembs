class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(res.size()==0 || !res.contains(nums[i])){

            
            int count = 0;
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count+=1;
                }
            
            }
            if(count > nums.length/3){
                res.add(nums[i]);
            }
            }

        }
        return res;
        
    }
}