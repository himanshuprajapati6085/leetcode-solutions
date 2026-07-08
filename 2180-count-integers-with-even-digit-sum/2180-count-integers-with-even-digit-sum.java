class Solution {
    public int countEven(int num) {
        int i=2;
        int count=0;
        while(i<=num){
            int j=i;
            int sum=0;
            while(j>0){
                int ld=j%10;
                System.out.println(ld);
                sum+=ld;
                j=j/10;
            }
            if(sum%2==0){
                count++;
            }
            i++;
        }
        return count;
    }
}