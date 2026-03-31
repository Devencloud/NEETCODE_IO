class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int en = nums.length-1;
        while(s<=en){
            int mid = s+(en-s)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[s]<=nums[mid]){
                if(target>=nums[s] && target<nums[mid]){
                      en = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
            else{
                 if(target >nums[mid] && target<=nums[en]){
                    s= mid+1;
                }
                else{
                    en = mid-1;
                }
                
            }
        }
        return -1;
           
        
    }
}
