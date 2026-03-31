class Solution {
    public int lengthOfLongestSubstring(String s) {
       int l = 0;
       int r = 0;
       int maxLen = 0;
       Map<Character, Integer> map = new HashMap<>();
       while(r<s.length()){
          if(!map.containsKey(s.charAt(r))|| map.get(s.charAt(r))<l){
            map.put(s.charAt(r),r);
            
          }
          else{
            l = map.get(s.charAt(r))+1;
            
           
            map.put(s.charAt(r),r);
          }
          
          int windowSize = r-l+1;
          maxLen = Math.max(maxLen, windowSize);
          r = r+1;



       }
       return maxLen;
        
    }
}
