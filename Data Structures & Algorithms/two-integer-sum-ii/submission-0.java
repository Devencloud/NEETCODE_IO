class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int[] ans =new int[2];
        int en = numbers.length-1;
        while(s<en){
            int temp  = numbers[s]+numbers[en];

        
            if(temp==target){
                ans[0] = s+1;
                ans[1] =en+1;
              
            }
            if(temp>target){
                en--;
            }
            else{
                s++;

            }

        }
        return ans;
        
    }
}
