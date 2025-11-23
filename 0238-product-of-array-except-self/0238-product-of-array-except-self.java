// Approach: Prefix & Suffix Product (No Division)
// 1. Create a result array where each index i initially stores the product of all elements
//    to the left of i (prefix product). Maintain a variable `prefix` that accumulates the
//    running product from the left side.
// 2. Then traverse the array from right to left using a variable `suffix` which tracks the
//    running product of elements to the right of i.
// 3. Multiply result[i] (prefix product) with `suffix` (right-side product). This gives the
//    product of all elements except nums[i].
// 4. Return the result array after the second pass.
//
// Time complexity: O(n) – two linear passes (left→right and right→left)
// Space complexity: O(1) extra space – result array does not count as extra space

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Calculate prefix products
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        // Step 2: Calculate suffix products (right side) and multiply with prefix values
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
    }
}
