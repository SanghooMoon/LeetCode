class Solution {
    public String firstPalindrome(String[] words) {
        String result = "";
        
        for(String word : words) {
            StringBuilder sb = new StringBuilder(word);
            if(word.equals(sb.reverse().toString())) {
                result = word;
                break;
            }
        }
        
        return result;
    }
}