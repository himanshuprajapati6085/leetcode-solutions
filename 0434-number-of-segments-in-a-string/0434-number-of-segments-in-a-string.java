class Solution {
    public int countSegments(String s) {
        int seg=0;
        for(int i=0; i<s.length(); i++){
            // if(s.length()==0) return seg=0;
            //     if(s.charAt(i) == ' ') seg++;
            if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                seg++;
            }
        }
        return seg;
    }
}