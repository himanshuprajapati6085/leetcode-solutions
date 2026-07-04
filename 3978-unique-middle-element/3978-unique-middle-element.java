class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int count=0;
        int middle=nums[nums.length/2];
        for(int i=0; i<nums.length; i++){
            if(nums[i]==middle) count++;
        }
        if(count==1) return true;
        else return false;
    }
}