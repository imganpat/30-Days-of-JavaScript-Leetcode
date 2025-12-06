// Approach: Sorting + Merge Overlapping Intervals
// 1. Sort all intervals by their starting time to ensure they are processed in order.
// 2. Create a list (`mergedIntervals`) and insert the first interval as the starting point.
// 3. Traverse through the sorted intervals:
//      - Compare the current interval with the last merged interval.
//      - If they overlap (last[1] >= current[0]), merge them by updating the end value.
//      - Otherwise, add the current interval as a new non-overlapping interval.
// 4. Convert the merged list back into a 2D array and return it.
// 5. This ensures all overlapping intervals are merged efficiently.
//
// Time complexity: O(n log n) – due to sorting the intervals
// Space complexity: O(n) – output list may hold all intervals in worst case

class Solution {
    public int[][] merge(int[][] intervals) {

        // Step 1: Sort intervals by starting time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        // Step 2: Initialize the result list with the first interval
        List<int[]> mergedIntervals = new ArrayList<>();
        mergedIntervals.add(intervals[0]);

        // Step 3: Process and merge overlapping intervals
        for (int i = 1; i < intervals.length; i++) {
            
            // 🔹 Always check the LAST interval in the result list
            //    NOT intervals[i-1], because merging changes res size
            int[] last = mergedIntervals.get(mergedIntervals.size() - 1);

            // Check if current interval overlaps with the last merged interval
            if (last[1] >= intervals[i][0]) {

                // 🔹 Merge occurs: update the end of the last interval
                // last[0] is always <= intervals[i][0] because of sorting
                last[1] = Math.max(last[1], intervals[i][1]);
            } 
            else {
                // No overlap → add new interval
                mergedIntervals.add(intervals[i]);
            }
        }

        // Step 4: Convert list to 2D array and return
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
