class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0;
        int sumEven=0;
        for(int i=1; i<=n; i++){
            sumOdd+=(i*2)-1;
            sumEven+=i*2;
        }
        return sumEven-sumOdd;
    }
}