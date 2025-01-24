class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> reverseGraph = new ArrayList<>();
        int[] inDegree = new int[n];
        
        // Step 1: Create reverse graph and calculate in-degree of each node
        for (int i = 0; i < n; i++) {
            reverseGraph.add(new ArrayList<>());
        }
        
        for (int i = 0; i < n; i++) {
            for (int neighbor : graph[i]) {
                reverseGraph.get(neighbor).add(i); // Reverse edge
                inDegree[i]++; // Count in-degree
            }
        }
        
        // Step 2: Use Kahn's algorithm to find all safe nodes
        Queue<Integer> queue = new LinkedList<>();
        
        // Add all nodes with 0 in-degree (terminal nodes in the original graph)
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }
        
        // Step 3: Perform topological sort
        List<Integer> safeNodes = new ArrayList<>();
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            safeNodes.add(node);
            
            for (int neighbor : reverseGraph.get(node)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }
        
        // Step 4: Sort the safe nodes in ascending order
        safeNodes.sort(Integer::compareTo);
        
        return safeNodes;
    }
}