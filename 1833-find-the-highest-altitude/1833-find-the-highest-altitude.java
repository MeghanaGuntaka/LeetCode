class Solution {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;  // Start at altitude 0
        int maxAltitude = 0;      // Track the highest altitude

        // Traverse the gain array
        for (int g : gain) {
            currentAltitude += g;     // Calculate the new altitude
            maxAltitude = Math.max(maxAltitude, currentAltitude);  // Update maxAltitude if necessary
        }

        return maxAltitude;

        
    }
}