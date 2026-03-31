class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> s = new ArrayDeque<>();
        int max = 0;
        for(int i = 0;i<heights.length;i++){
            if(s.isEmpty() || heights[i]>heights[s.peek()]){
                s.push(i);


            }
            else{
                while(!s.isEmpty() && heights[i]<heights[s.peek()]){
                    int t = s.pop();
                    int width = 0;
                    if(s.isEmpty()){
                        width = i;
                    }
                    else{
                        width = i-s.peek()-1;
                    }
                    int area = heights[t]*width;
                    max = Math.max(area,max);

                }
                s.push(i);
            }
        }
        while(!s.isEmpty()){
            int t = s.pop();
            int width = 0;
            if(s.isEmpty()){
                width = heights.length;
            }
            else{
                width = heights.length-s.peek()-1;
            }
            int area = heights[t]*width;
            max = Math.max(area,max);
            width++;
        }
        return max;
       



    }
}
