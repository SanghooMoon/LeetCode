class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (char stone : stones.toCharArray()) {
            if (jewels.contains(String.valueOf(stone))) {
                count++;
            }
        }

        return count;
    }
}