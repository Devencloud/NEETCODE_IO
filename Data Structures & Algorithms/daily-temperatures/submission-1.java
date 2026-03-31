class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=  temperatures.length;
        int[] res = new int[n];
        Deque<Integer> s = new ArrayDeque<>();
        for(int i = 0;i<n;i++){
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                res[s.peek()] = i-s.peek();
                s.pop();

            }
            s.push(i);
        }
        return res;

      
         


    
       
    }
}
