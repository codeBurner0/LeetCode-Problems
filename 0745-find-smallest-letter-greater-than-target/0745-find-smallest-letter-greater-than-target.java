class Solution {
    public char nextGreatestLetter(char[] letter, char target) {
        // for(int i=0;i<letter.length;i++){
        //     if(letter[i]>target){
        //         return letter[i];
        //     }
        // }
        // return letter[0];
        int start=0;
        int end=letter.length-1;
        int ans=end;
        while(start<=end){
            int mid=(start+end)/2;
            if(letter[mid]>target){
                if(letter[mid]<letter[ans]){
                    ans=mid;
                }
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        if(letter[ans]>target){
        return letter[ans];
        }else{
            return letter[0];
        }
    }
}