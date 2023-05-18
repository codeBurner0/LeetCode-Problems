class Solution {
    public int reverse(int x) {
        
        long rev=0;
        int n=Math.abs(x);
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*rev);
        }
        return (int)rev;
    }
}