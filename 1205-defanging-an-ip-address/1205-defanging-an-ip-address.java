// Approach: Brute Force
// Time Complexity : O(n)
// Space Complexity : O(n)

class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        int addressLength = address.length();
        for(int i = 0; i < addressLength; i++){
            if(address.charAt(i) == '.'){
                sb.append("[.]");
            } else {
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();

        // using in built function
        // return address.replace(".", "[.]");
    }
}
