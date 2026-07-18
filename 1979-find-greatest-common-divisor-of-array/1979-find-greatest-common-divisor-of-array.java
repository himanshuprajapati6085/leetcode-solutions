class Solution {
    public int findGCD(int[] nums) {
        int max_num=0, gcd=1, min_num=nums[0];
        for(int i=0; i<nums.length; i++){
            max_num=Math.max(max_num,nums[i]);
            min_num=Math.min(min_num, nums[i]);
        }
        if(max_num%min_num == 0) gcd=min_num;
        else {
            for(int i=min_num; i>1; i--){
                if((max_num%i ==0) && (min_num%i ==0)){
                    gcd=i;
                    break;
                }
            }
        };
        return gcd;
    }
}