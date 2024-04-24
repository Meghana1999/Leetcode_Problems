class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
         int ans[] = new int[2];
         for(int i=0;i<nums.length;i++){
             int cur = nums[i];
             int x = target - cur;
             if(mp.containsKey(x)){
                 ans[0]=i;
                 ans[1]= mp.get(x);
                 return ans;
             }
             else{
                 mp.put(cur,i);
             }
         }
         return null;
    }
}