class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int idx=0;
        int i=0;
        for(;i<nums.length;i++){
            int res=target-nums[i];
            if(map.containsKey(res)){
                idx=map.get(res);
                break;
            }
            map.put(nums[i],i);
        }
        int arr[]={i,idx};
        return arr;
    }
}