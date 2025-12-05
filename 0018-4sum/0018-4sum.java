class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> uniqueQuad = new HashSet<>();
        int n = nums.length;

        for (int a = 0; a < n; a++) {
            for (int b = a + 1; b < n; b++) {
                
                Set<Long> set = new HashSet<>();
                for (int c = b + 1; c < n; c++) {
                    long sum = (long) nums[a] + nums[b] + nums[c];
                    long t = (long) target - sum;
                    if(set.contains(t)){
                        List<Integer> quad = new ArrayList<>(Arrays.asList(nums[a], nums[b], nums[c], (int) t));
                        Collections.sort(quad);
                        uniqueQuad.add(quad);
                    }
                    set.add((long) nums[c]);
                }
            }
        }

        return new ArrayList<>(uniqueQuad);
    }
}