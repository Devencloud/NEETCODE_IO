class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int maxLen= 0;
        int freq = 0;
        int l = 0;
        
       for(int r = 0;r<s.length();r++){
        char c = s.charAt(r);
        arr[c-'A']++;
        freq= Math.max(freq, arr[c-'A']);
        while(r-l+1 - freq>k){
            arr[s.charAt(l)-'A']--;
            l++;
        }
        maxLen = Math.max(maxLen,r-l+1);

       }
       return maxLen;
        
    }
}
