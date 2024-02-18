class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        int point = 0;
        
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            result += Math.pow(26, point++) * (columnTitle.charAt(i) - 64);
        }
        
        return result;
    }
}