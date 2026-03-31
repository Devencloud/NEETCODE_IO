class Solution {
    public boolean isPalindrome(String s) {
         int l = 0;
        int e = s.length() - 1;

        while (l <= e) {
            // skip non-alphanumeric characters
            while (l < e && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (l < e && !Character.isLetterOrDigit(s.charAt(e))) {
                e--;
            }

            // compare in lowercase
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(e))) {
                return false;
            }
        
            l++;
            e--;
        }
        return true;
        
    }
}
