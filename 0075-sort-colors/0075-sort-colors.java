class Solution {
    public void sortColors(int[] nums) {

        int zeros = 0;
        int ones = 0;
        int n = nums.length;

        // Count the number of 0s and 1s
        for (int num : nums) {

            if (num == 0) {
                zeros++;
            }
            else if (num == 1) {
                ones++;
            }
        }

        // Fill 0s
        for (int i = 0; i < zeros; i++) {
            nums[i] = 0;
        }

        // Fill 1s
        for (int i = zeros; i < zeros + ones; i++) {
            nums[i] = 1;
        }

        // Fill 2s
        for (int i = zeros + ones; i < n; i++) {
            nums[i] = 2;
        }
    }
}