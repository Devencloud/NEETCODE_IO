class Solution {
    public int maxArea(int[] heights) {
        int i=  0;
        int j= heights.length-1;
        int ans = 0;
        int temp = 1;
        while(i<j){
            temp = Math.min(heights[i],heights[j])*(j-i);
            if(temp>ans){
                ans = temp;
            }
            if(heights[i]>heights[j]){
                j--;
            }
            else{
                i++;

            }

        }
        return ans;

        
    }
}
