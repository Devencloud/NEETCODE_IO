class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int en = nums.length-1;
        while(s<=en){
            int mid = s+(en-s)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                en = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return -1;
        
    }
}
