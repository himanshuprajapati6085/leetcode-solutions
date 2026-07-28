class Solution {
    public char findTheDifference(String s, String t) {
        ArrayList<Character> letr=new ArrayList<>();
        for(int i=0; i<t.length();i++){
            letr.add(t.charAt(i));
        }
        for(int j=0;j<s.length();j++){
            letr.remove(Character.valueOf(s.charAt(j)));
        }
        return letr.get(0);
    }
}