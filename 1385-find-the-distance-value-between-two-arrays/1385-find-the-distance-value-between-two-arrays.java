class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        int sign =0;
        for(int i=0; i<arr1.length; i++){
            sign=0;
            for(int j=0; j<arr2.length; j++){
                int num = Math.abs(arr1[i] - arr2[j]);
                if(num > d){

                }else{
                    sign=-1;
                }

                if(sign==-1)break;
               
            }

            if(sign==0)count++;
        }
        return count;
    }
}