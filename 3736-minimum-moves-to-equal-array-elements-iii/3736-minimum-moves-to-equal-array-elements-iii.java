class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int moves=0;
        int target = nums[nums.length-1];
        for(int i=0; i<nums.length; i++){
            int max=target-nums[i];
            moves += max;
        }
        return moves;
    }
}