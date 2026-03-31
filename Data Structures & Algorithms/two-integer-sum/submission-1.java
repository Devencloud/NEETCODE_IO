class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp = target - nums[i];
            if(m.containsKey(temp)){
                int j = m.get(temp);
                return new int[]{Math.min(i,j),Math.max(i,j)};
            }
            else{
                m.put(nums[i],i);
            }
        }
        return new int[]{};
        
        
    }
}