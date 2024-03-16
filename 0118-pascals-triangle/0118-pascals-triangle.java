class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (i <= 1 || j == 0 || j == i) {
                    list.add(1);
                    continue;
                }
                List<Integer> beforeList = answer.get(i - 1);
                list.add(beforeList.get(j - 1) + beforeList.get(j));
            }
            answer.add(list);
        }
        return answer;
    }
}