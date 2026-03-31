class Solution {
    public int findMin(int[] nums) {
        int s = 0;
        int en = nums.length-1;
       while(s<en){
        int mid = s+(en-s)/2;
        if(nums[mid]>nums[en]){
            s = mid+1;


        }
        else{
            en = mid;
        }
       }
       return nums[s];
    }
}
