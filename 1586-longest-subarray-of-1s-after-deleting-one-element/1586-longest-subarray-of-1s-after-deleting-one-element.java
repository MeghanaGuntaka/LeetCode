class Solution {
    public int longestSubarray(int[] nums) {
        
         int left = 0;   // Left pointer of the sliding window
        int zeros = 0;  // To count zeros in the current window
        int maxLength = 0;  // To store the maximum length of subarray with at most one 0
        
        // Iterate through the array using the right pointer
        for (int right = 0; right < nums.length; right++) {
            // If we encounter a 0, increment the zero count
            if (nums[right] == 0) {
                zeros++;
            }
            
            // If there are more than 1 zero, move the left pointer to reduce zero count
            while (zeros > 1) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
            
            // Calculate the maximum length of subarray with at most one 0
            maxLength = Math.max(maxLength, right - left);
        }
        
        // Return the result, but subtract 1 because we have to delete one element
        return maxLength;
    }
}