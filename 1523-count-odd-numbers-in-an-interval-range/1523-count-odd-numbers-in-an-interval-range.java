class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        
        for (int i = low; i <= high;) {
            if (i % 2 == 1) {
                count++;
                i += 2;
                continue;
            }
            i++;
        }

        return count;
    }
}