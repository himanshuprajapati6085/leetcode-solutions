class Solution {
    public int maximumCount(int[] nums) {
        int pos=0, neg=0;
        for(int index=0; index<nums.length; index++){
            if(nums[index]<0)neg++;
            if(nums[index]>0)pos++;
        }
        if(pos==neg) return pos;
        if(pos>neg) return pos;
        return neg;
    }
}