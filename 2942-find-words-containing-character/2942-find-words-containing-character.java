class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> index=new ArrayList<>();
        for(int i=0; i<words.length; i++){
            int count=0;
            for(int start=0; start<words[i].length(); start++){
                if(words[i].charAt(start)==x){
                    index.add(i);
                    break;
                }
            }
        }
        return index;
    }
}