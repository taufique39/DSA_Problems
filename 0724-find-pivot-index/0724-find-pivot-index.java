class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum = 0;
        for(int i = 0; i < nums.length; i++){
            totalsum += nums[i];
        }
        int current = 0;
        int leftsum = 0;
        int rightsum = 0;
        for(int i = 0; i < nums.length; i++){
            current = nums[i];
            rightsum = totalsum - leftsum - current;
            
            if(leftsum == rightsum){
                return i;
            }
            leftsum += current;
        }
        return -1;

    }
}