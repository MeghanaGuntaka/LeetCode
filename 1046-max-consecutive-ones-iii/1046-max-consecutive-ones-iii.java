class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;  // left pointer for sliding window
        int right = 0;  // right pointer for sliding window
        int maxConsecutiveOnes = 0;
        int zeroCount = 0;  // count of zeroes in the current window
        
        // Iterate through the array with the right pointer
        while (right < nums.length) {
            // If we encounter a zero, increment zeroCount
            if (nums[right] == 0) {
                zeroCount++;
            }
            
            // If zeroCount exceeds k, shrink the window from the left
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;  // Shrink the window
            }
            
            // Update the maximum length of the window with at most k zeroes
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, right - left + 1);
            right++;  // Expand the window
        }
        
        return maxConsecutiveOnes;
        
    }
}