class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        
        while( l < r){
            char lc = Character.toLowerCase(s.charAt(l)), rc = Character.toLowerCase(s.charAt(r));
            
            if (!((lc >= 'a' && lc <= 'z') || (lc >= '0' && lc <= '9'))) {
                l++;
                continue;
            }

            if (!((rc >= 'a' && rc <= 'z') || (rc >= '0' && rc <= '9'))) {
                r--;
                continue;
            }

            if(lc != rc){
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}