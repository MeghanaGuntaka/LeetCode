class Solution {
    public long countBadPairs(int[] nums) {
        Map<Long, Long> map = new HashMap<>();
        long badPairs = 0;
        
        for (int i = 0; i < nums.length; i++) {
            long key = (long) i - nums[i];
            if (map.containsKey(key)) {
                badPairs += map.get(key);
            }
            map.put(key, map.getOrDefault(key, 0L) + 1);
        }
        return (long) nums.length * (nums.length - 1) / 2 - badPairs;
    }
}