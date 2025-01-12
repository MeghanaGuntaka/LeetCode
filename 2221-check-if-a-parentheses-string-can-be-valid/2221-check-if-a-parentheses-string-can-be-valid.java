class Solution {
    public boolean canBeValid(String s, String locked) {
         int n = s.length();
        if (n % 2 != 0) {
            return false;
        }
        int open = 0; 
        int flexible = 0; 
        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '0') {
                flexible++; 
            } else if (s.charAt(i) == '(') {
                open++; 
            } else {
                open--;  
            }
            if (open < 0) {
                if (flexible > 0) {
                    flexible--;  
                    open++;  
                } else {
                    return false;  
                }
            }
        }
        int close = 0;  
        flexible = 0;  
        for (int i = n - 1; i >= 0; i--) {
            if (locked.charAt(i) == '0') {
                flexible++; 
            } else if (s.charAt(i) == ')') {
                close++; 
            } else {
                close--;  
            }

            if (close < 0) {
                if (flexible > 0) {
                    flexible--;  
                    close++; 
                } else {
                    return false;  
                }
            }
        }

        return true;
        
    }
}