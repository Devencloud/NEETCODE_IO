class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        if(n==1){
            return new int[]{0};
        }
        int[] res = new int[n];
        Deque<Integer> s = new ArrayDeque<>();
        
        for(int i = 0;i<n;i++){
          
          while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
            int index = s.pop();
            res[index] = i-index;



          }
          s.push(i);
         


        }
        return res;
       
    }
}
