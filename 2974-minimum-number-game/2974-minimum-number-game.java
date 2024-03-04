class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        int index = 0;
        
        for (int i=0; i<nums.length/2; i++) {
            Arrays.sort(nums);
            
            arr[index++] = nums[1];
            arr[index++] = nums[0];
            nums[0] = 100; nums[1] = 100;
        }
        
        return arr;
        
        /**
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i += 2 ) {
            int t = nums[i]; 
            nums[i] = nums[i-1]; 
            nums[i-1] = t;
        }
        return nums;
        
        */
    }
}