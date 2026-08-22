class Solution {
    public boolean checkDivisibility(int n) {
        int digSum=0;
        int digProd=1;
        int o=n;
        while(n>0){
            int ld=n%10;
            digSum+=ld;
            digProd*=ld;
            n=n/10;
        }
        int sum=digSum+digProd;
        if(o%sum == 0)return true;
        else return false;
    }
}