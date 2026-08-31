class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        for(int result : count.keySet()){
            if(count.get(result) > nums.length/2){
                return result;
            }
        }
        return -1;
    }
}