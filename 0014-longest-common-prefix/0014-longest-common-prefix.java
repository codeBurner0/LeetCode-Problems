class Solution {
    public String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        int mini=Math.min(str[0].length(),str[str.length-1].length());
        String s1=str[0];
        String s2=str[str.length-1];
        String ans="";
        for(int i=0;i<mini;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                ans+=s1.charAt(i);
            }else{
                break;
            }
        }
        return ans;
    }
}