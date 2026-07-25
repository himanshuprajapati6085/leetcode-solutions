class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> num = new ArrayList<>();
        while(n>0){
            int ld=n%10;
            num.add(ld);
            n=n/10;
        }
        Collections.sort(num);

        return num.get(num.size()-1)*num.get(num.size()-2);
    }
}