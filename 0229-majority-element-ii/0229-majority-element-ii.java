class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int cnt1=0,cnt2=0;
        int el1 = Integer.MIN_VALUE,el2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && nums[i]!=el2){
                cnt1++;
                el1 = nums[i];
                
            }
            else if(cnt2==0 && nums[i]!=el1){
                cnt2++;
                el2 = nums[i];
            }
            else if(nums[i] == el1){
                cnt1++;
            }
            else if(nums[i] == el2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
            
        }

        //Manual Check

         cnt1 = 0;
         cnt2=0;
        int mini = (nums.length/3) + 1;
        for(int i=0;i<nums.length;i++){
            if(el1 == nums[i]){
                cnt1++;
            }
            if(el2 == nums[i]){
                cnt2++;
            }
        }
        if(cnt1>=mini){
            res.add(el1);
        }
        if(cnt2>=mini){
            res.add(el2);
        }
        return res;
    }

}