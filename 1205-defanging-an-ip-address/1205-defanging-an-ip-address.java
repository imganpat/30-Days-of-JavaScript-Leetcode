// Approach: Brute Force
// Time Complexity : O(n)
// Space Complexity : O(n)

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
