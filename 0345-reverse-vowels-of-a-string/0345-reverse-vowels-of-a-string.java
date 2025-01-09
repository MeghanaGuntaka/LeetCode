class Solution {
    public String reverseVowels(String s) {
         StringBuilder sb = new StringBuilder(s);
        int end = s.length()-1;

        int i = 0;
        while (i<end) {
            char c = s.charAt(i);
            if(c == 'a' ||c == 'A' ||c == 'e' ||c == 'E' ||c == 'i' ||c == 'I' ||c == 'o' ||c == 'O' ||c == 'u' ||c == 'U') {
                for(int j=end; j>i; j--) {
                    char c2 = s.charAt(j);
                    if(c2== 'a' || c2=='A' || c2=='e' || c2=='E' || c2=='i' || c2=='I' || c2=='o' || c2=='O' || c2=='u' || c2=='U') {
                        sb.setCharAt(i, c2);
                        sb.setCharAt(j, c);
                        end = j-1;
                        break;
                    }
                }
            }
            i++;
        }
        String result = sb.toString();
        return result;
        
    }
}