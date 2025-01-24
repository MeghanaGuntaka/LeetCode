class Solution {
    public int pivotIndex(int[] nums) {
          int totalSum = 0;
        int leftSum = 0;
        
        // Step 1: Calculate total sum of the array
        for (int num : nums) {
            totalSum += num;
        }
        
        // Step 2: Iterate through the array and calculate left and right sums
        for (int i = 0; i < nums.length; i++) {
            // Right sum is totalSum minus leftSum minus nums[i]
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i]; // Update leftSum for the next index
        }
        
        // Step 3: If no pivot index is found, return -1
        return -1;
        
    }
}