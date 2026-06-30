class Solution {
    public int missingNumber(int[] nums) {
        int min_num = nums[0];
        int max_num = nums[0];
        for (int i = 0; i < nums.length; i++) {
            min_num = Math.min(min_num, nums[i]);
            max_num = Math.max(max_num, nums[i]);
        }
        for (int i = 0; i <= nums.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return i;
        }
        return -1;
    }
}