class Solution {
    public long sumAndMultiply(int n) {
        int sec_n=0;
        int thd_n=0;
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum+=ld;
            if(ld!=0){
            sec_n=(sec_n*10)+ld;
            }
            n=n/10;
        }
        while(sec_n>0){
            int ld=sec_n%10;
            thd_n=(thd_n*10)+ld;
            sec_n=sec_n/10;
        }
        return (long)sum*thd_n;

    }
}