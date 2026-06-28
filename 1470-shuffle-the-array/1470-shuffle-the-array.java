class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] x=new int[n];
        int[] y=new int[n]; 
        int[] shuffled=new int[2*n];
        for(int i=0; i<n; i++){
            int j=n+i;
            x[i]=nums[i]; //Treated as x
            y[i]=nums[j]; //Treated as y
            j++;
        }
        int a=0, b=0;
        for(int i=0;i<2*n; i++){
            if(i%2 == 0){
                shuffled[i]=x[a];
                a++;}
            else {
                shuffled[i]=y[b];
                b++;}
            // if(k<n){
            // if(i%2 ==0)shuffled[i]=x[k];
            // else shuffled[i]=y[k];
            // k++;
            // }
        }
        return shuffled;
    }
}