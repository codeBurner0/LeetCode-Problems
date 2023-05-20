class Solution {
    public String mergeAlternately(String w1, String w2) {
        int len=Math.max(w1.length(),w2.length());
        int len1=w1.length()-1;
        int len2=w2.length()-1;
        int i=0;
        String res="";
        while(len>0){
            if(len1>=0){
                res+=w1.charAt(i);
            }
            if(len2>=0){
                res+=w2.charAt(i);
            }
            len1--;
            len2--;
            len--;
            i++;
        }
        return res;
    }
}