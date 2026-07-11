class Solution {
    public int sumOfPrimesInRange(int n) {
        int r=0;
        int s=n;
        while(s>0){
            int ld=s%10;
            r=r*10+ld;
            s=s/10;
        }
        int start=Math.min(n,r);
        int end=Math.max(n,r);
        int sum=0;
        for(int i=start; i<=end; i++){
            int count=0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
            sum=sum+i;
            }
        }
        
        return sum;
    }
}