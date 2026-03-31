class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=  new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1])
            continue;
            int left = i+1;
            int right = nums.length-1;
            
            while(left<right){
                List<Integer> temp = new ArrayList<>();
                if((nums[left]+nums[right])==(-nums[i])){
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    ans.add(temp);
                    while(left < right && nums[left] == nums[left+1]) left++;
                    while(left < right && nums[right] == nums[right-1]) right--;
                    right--;
                    left++;


                }
                else if((nums[left]+nums[right])>(-nums[i])){
                    right--;
                }
                else{
                    left++;
                }
            }

        }
        return ans;
        
        
    }
}
