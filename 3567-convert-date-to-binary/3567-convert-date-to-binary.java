// Approach: Brute force
// Time Complexity: O(1)
// Space Complexity: O(1)

class Solution {
    public String convertDateToBinary(String date) {
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int d = Integer.parseInt(date.substring(8,10));
        StringBuilder res = new StringBuilder();
        res.append(Integer.toBinaryString(year));
        res.append("-");
        res.append(Integer.toBinaryString(month));
        res.append("-");
        res.append(Integer.toBinaryString(d));

        return res.toString();
    }
}