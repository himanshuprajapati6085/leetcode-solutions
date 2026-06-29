class Solution {
    public String restoreString(String s, int[] indices) {
        char[] shuffled_s= new char[s.length()];
        for(int i=0; i<s.length(); i++){
            shuffled_s[indices[i]]=s.charAt(i);
        }
        return new String(shuffled_s);
    }
}  