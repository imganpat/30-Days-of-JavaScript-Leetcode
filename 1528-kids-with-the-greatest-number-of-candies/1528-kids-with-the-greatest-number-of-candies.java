// Approach: Two-step linear pass: first find max, then check each kid against max.
// Time complexity: O(n)
// Space complexity: O(n)

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = candies[0];

        // Step 1: Find maximum candies among kids
        for (int candy : candies) {
            if (maxCandies < candy) {
                maxCandies = candy;
            }
        }

        // Step 2: Check each kid
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }
}