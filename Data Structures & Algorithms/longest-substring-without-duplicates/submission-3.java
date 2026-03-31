class Solution {
    public int lengthOfLongestSubstring(String s) {
     int l = 0;
     int r = 0;
     int maxLen = 0;
     Map<Character,Integer> map = new HashMap<>();
     while(r<s.length()){
        char c = s.charAt(r);
        if(!map.containsKey(c) || map.get(c)<l){
            map.put(c,r);

        }
        else{
            l = map.get(c)+1;
            map.put(c,r);
        }
        int window = r-l+1;
        maxLen = Math.max(maxLen,window);
        r = r+1;
        
     }
     return maxLen;
    }
}
