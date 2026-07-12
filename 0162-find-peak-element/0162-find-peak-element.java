class Solution {
    public int findPeakElement(int[] nums) {
        int max=Integer.MIN_VALUE;
        int j=0;
        int max_index=0;

        for(int i=0; i<nums.length; i++){
            max=Math.max(max,nums[i]);
        }
        while(j<nums.length){
            if(max==nums[j]){
                max_index=j;
                break;
            }
            j++;
        }
        return max_index;
    }
}