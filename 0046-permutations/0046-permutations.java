class Solution {
    public void permuteAll(int[] nums, int curr, List<List<Integer>> result){
        if(curr == nums.length){
            List<Integer> temp = new ArrayList<Integer>();
            for(int k : nums){
                temp.add(k);
            }
            result.add(temp);
            return;
        }
        for(int i=curr; i<nums.length; i++){
            int temp = nums[curr];
            nums[curr] = nums[i];
            nums[i] = temp;

            permuteAll(nums, curr+1, result);

            temp = nums[curr];
            nums[curr] = nums[i];
            nums[i] = temp;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        permuteAll(nums, 0, result);
        return result;
    }
}