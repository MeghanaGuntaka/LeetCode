class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurrenceMap = new HashMap<>();
        
        // Step 1: Count the occurrences of each number in the array.
        for (int num : arr) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Check for unique occurrence counts using a HashSet.
        Set<Integer> occurrenceSet = new HashSet<>();
        for (int count : occurrenceMap.values()) {
            // If the occurrence count is already in the set, return false.
            if (!occurrenceSet.add(count)) {
                return false;
            }
        }
        
        // Step 3: If all counts are unique, return true.
        return true;
    }
}