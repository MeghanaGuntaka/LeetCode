class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        // If the strings are already equal, return true
        if (s1.equals(s2)) {
            return true;
        }

        // Store indices where characters differ
        int first = -1, second = -1;
        int count = 0;
        
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                
                if (count > 2) {
                    return false; // More than two mismatches cannot be fixed with one swap
                }
                
                if (first == -1) {
                    first = i;
                } else {
                    second = i;
                }
            }
        }

        // There must be exactly two mismatched characters and swapping them should fix the issue
        return count == 2 && 
               s1.charAt(first) == s2.charAt(second) && 
               s1.charAt(second) == s2.charAt(first);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        System.out.println(sol.areAlmostEqual("bank", "kanb")); // true
        System.out.println(sol.areAlmostEqual("attack", "defend")); // false
        System.out.println(sol.areAlmostEqual("kelb", "kelb")); // true
    }
}
