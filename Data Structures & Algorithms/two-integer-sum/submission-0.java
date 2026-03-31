class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int comp = target-nums[i];
            if(m.containsKey(comp)){
                int j = m.get(comp);
                return new int[]{Math.min(i,j),Math.max(i,j)};
            }
            m.put(nums[i],i);
        }
        return new int[]{};
        
    }
}