class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        Map<Integer, Integer> mpp = new HashMap<>();
        int n = nums.length;
        int mini = (n / 3) + 1;

        for (int i = 0; i < n; i++) {
            int count = mpp.getOrDefault(nums[i], 0) + 1;
            mpp.put(nums[i], count);

            if (count == mini) {
                ls.add(nums[i]);
            }
            if (ls.size() == 2) {
                break;
            }
        }

        Collections.sort(ls);
        return ls;
    }
}