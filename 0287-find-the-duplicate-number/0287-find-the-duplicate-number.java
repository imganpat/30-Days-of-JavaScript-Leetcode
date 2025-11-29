class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for (int n : nums) {
            // if(map.contains(n)) {
            //     return n;
            // }
            if (!map.add(n)) {
                return n;
            }
            // map.add(n);
        }
        return 0;
    }
}
