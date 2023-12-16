class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : ransomNote.toCharArray()) {
            Integer value = map.get(ch);
            if (value == null || value < 1) {
                return false;
            }
            map.put(ch, value - 1);
        }

        return true;    }
}