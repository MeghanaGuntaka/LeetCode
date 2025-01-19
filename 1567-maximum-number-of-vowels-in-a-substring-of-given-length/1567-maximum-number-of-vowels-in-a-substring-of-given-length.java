class Solution {
     private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public int maxVowels(String s, int k) {
        int maxVowels = 0, currentVowelCount = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowelCount++;
            }
        }
        maxVowels = currentVowelCount; 
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k))) {
                currentVowelCount--;
            }
            if (isVowel(s.charAt(i))) {
                currentVowelCount++;
            }
            maxVowels = Math.max(maxVowels, currentVowelCount);
        }
        
        return maxVowels;
    }
}