class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> lastIndex = new HashMap<>();
        List<Integer> partitions = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            lastIndex.put(s.charAt(i), i);
        }

        for (int i = 0, end = 0, size = 0; i < s.length(); i++) {
            size++;
            end = Math.max(end, lastIndex.get(s.charAt(i)));

            if (i == end) {
                partitions.add(size);
                size = 0;
            }
        }

        return partitions;
    }
}
