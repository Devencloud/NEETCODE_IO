class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int maxLen = 0;
        int maxFreq = 0;
        for(int r = 0;r<s.length();r++){
            freq[s.charAt(r)-'A']++;
            maxFreq = Math.max(maxFreq,freq[s.charAt(r)-'A']);
            
            while((r-left+1) - maxFreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, r-left+1);

        }
        return maxLen;
        
    }
}
