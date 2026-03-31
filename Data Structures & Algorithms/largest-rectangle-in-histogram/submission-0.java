class Solution {
    public int largestRectangleArea(int[] heights) {
         int n = heights.length;
        Deque<Integer> s = new ArrayDeque<>();
        int max = 0;
        
        for(int i = 0;i<n;i++){
            if(s.isEmpty() || heights[i]>=heights[s.peek()]){
                s.push(i);
            }
            else{
               while(!s.isEmpty() && heights[i]<heights[s.peek()]){
                int top = s.pop();
                int width = 0;
                if(s.isEmpty()){
                    width = i;
                }
                else{
                    width = i-s.peek()-1;
                }
                int curr=  heights[top]*width;
                max = Math.max(max,curr);
                

               }
               s.push(i);
            }
            

            

           
        }
        while(!s.isEmpty()){
            int top = s.pop();
                int width = 0;
                if(s.isEmpty()){
                    width = n;
                }
                else{
                    width = n-s.peek()-1;
                }
                int curr=  heights[top]*width;
                max = Math.max(max,curr);
            

        }
        return max;
        
        
    }
}
