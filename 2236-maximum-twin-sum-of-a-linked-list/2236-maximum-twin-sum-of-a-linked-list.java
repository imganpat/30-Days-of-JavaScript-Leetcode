class Solution {
    public int pairSum(ListNode head) {
        List<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }

        int maxSum = 0;
        int n = values.size();
        for (int i = 0; i < n / 2; i++) {
            int twinSum = values.get(i) + values.get(n - 1 - i);
            maxSum = Math.max(maxSum, twinSum);
        }

        return maxSum;
    }
}
