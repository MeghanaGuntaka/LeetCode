class Solution {
    public int minimizeXor(int num1, int num2) {
        int setBitsNum2 = Integer.bitCount(num2);
        int x = 0;
        for (int i = 31; i >= 0; i--) {
            if ((num1 & (1 << i)) != 0 && setBitsNum2 > 0) {
                x |= (1 << i);
                setBitsNum2--;
            }
        }
        for (int i = 0; i <= 31 && setBitsNum2 > 0; i++) {
            if ((x & (1 << i)) == 0) {
                x |= (1 << i);
                setBitsNum2--;
            }
        }
        
        return x;
        
    }
}