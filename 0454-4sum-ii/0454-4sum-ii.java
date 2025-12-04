class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                for (int k = 0; k < nums3.length; k++) {
                    int sum = nums1[i] + nums2[j] + nums3[k];
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }

        for (int i = 0; i < nums4.length; i++) {
            int n = -nums4[i];
            count += map.getOrDefault(n, 0);
        }
        return count;
    }
}