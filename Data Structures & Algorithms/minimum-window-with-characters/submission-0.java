class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        int[] need = new int[128];
        int[] window = new int[128];
        for(char c: t.toCharArray()){
            need[c]++;
        }
        int required = 0;
        for(int count :need){
            if(count>0) required++;
        }
        int formed = 0;
        int l = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        for(int r = 0;r<s.length();r++){
            char c = s.charAt(r);
            window[c]++;
            if(need[c]>0 && need[c]==window[c] ){
                formed++;
            }
            while(formed==required){
                int windowSize =  r-l+1;
                if(windowSize<minLen){
                    minLen = windowSize;
                    start = l;
                }
                char leftChar = s.charAt(l);
                window[leftChar]--;
                if(need[leftChar]>0 && window[leftChar]<need[leftChar]){
                    formed--;
                   

                }
                l++;
            }
        }
        if(minLen == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+minLen);


        
    }
}
