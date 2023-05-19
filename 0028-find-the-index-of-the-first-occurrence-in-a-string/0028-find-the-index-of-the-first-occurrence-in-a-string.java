class Solution {
    public int strStr(String h, String n) {
        int len1=h.length();
        int len2=n.length();
        for(int i=0;i<len1;i++){
            if((len1-(i))>=len2){
                if(h.substring(i,len2+i).equals(n)){
                return i;
            }
            }
        }
        return -1;
    }
}