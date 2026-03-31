class Solution {
    public int longestConsecutive(int[] nums){
        Set<Integer> s= new HashSet<>();
        for(int num : nums){
            s.add(num);

        }
        int ans = 0;
        for(int num: s){
            if(s.contains(num-1)){
                continue;
            }
            int nextnum = num+1;
            int cnt = 1;
            while(s.contains(nextnum)){
                nextnum++;
                cnt++;
            }
            if(cnt>ans){
                ans = cnt;
            }

        }
        return ans;
        
        
    }
}
