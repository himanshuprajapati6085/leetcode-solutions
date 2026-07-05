class Solution {
    public int maxDigitRange(int[] nums) {
        int[] res= new int[nums.length];
        int nums_sum=0;
        int res_max=0;
        for(int i=0; i<nums.length; i++){
            int minn=Integer.MAX_VALUE;
            int maxx=Integer.MIN_VALUE;
            int temp = nums[i];
            while(temp>0){
                int ld=temp%10;
                minn=Math.min(minn,ld);
                maxx=Math.max(maxx,ld);
                temp = temp/10;
            }
            res[i]=maxx-minn;
        }
        for(int i=0; i<res.length; i++){
            res_max=Math.max(res_max,res[i]);
        }
        for(int i=0; i<res.length; i++){
            if(res[i]==res_max) nums_sum=nums_sum+nums[i];
        }
        
        return nums_sum;
    }
}