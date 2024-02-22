class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0; 
        int left = 0;
        int right = nums.size()-1;
        
        while(left < right){
            if(nums.get(left) + nums.get(right) < target){ 
                count += right-left; 
                left++; 
            } else { 
                right--; 
            }
        }
        return count;
        
        /*
        int result = 0;
        for (int i = 0; i < nums.size()-1; i++) {
            for (int j = i+1 ; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    result++;
                }
            }
        }
        return result;
        */
    }
}