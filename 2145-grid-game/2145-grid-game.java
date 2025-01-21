class Solution {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        long[] topPrefix = new long[n + 1];  
        long[] bottomPrefix = new long[n + 1]; 

        for (int i = 0; i < n; i++) {
            topPrefix[i + 1] = topPrefix[i] + grid[0][i];
            bottomPrefix[i + 1] = bottomPrefix[i] + grid[1][i];
        }
        
        long minSecondRobot = Long.MAX_VALUE; 
        for (int i = 0; i < n; i++) {
            long secondRobot = Math.max(topPrefix[n] - topPrefix[i + 1], bottomPrefix[i]);
            minSecondRobot = Math.min(minSecondRobot, secondRobot);
        }
        
        return minSecondRobot;
        
    }
}