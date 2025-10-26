class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastIndex = new int[26];
        List<Integer> partitions = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0, end = 0, size = 0; i < s.length(); i++) {
            size++;
            end = Math.max(end, lastIndex[s.charAt(i) - 'a']);

            if (i == end) {
                partitions.add(size);
                size = 0;
            }
        }

        return partitions;
    }
}
