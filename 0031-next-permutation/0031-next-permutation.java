class Solution {
    public void nextPermutation(int[] nums) {

        for (int i = nums.length - 1; i > 0; i--) {

            if (nums[i - 1] < nums[i]) {

                Arrays.sort(nums, i, nums.length);

                int k = i - 1;

                for (int j = i; j < nums.length; j++) {

                    if (nums[k] < nums[j]) {

                        int temp = nums[j];
                        nums[j] = nums[k];
                        nums[k] = temp;

                        return;
                    }
                }
            }
        }

        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
    }
}