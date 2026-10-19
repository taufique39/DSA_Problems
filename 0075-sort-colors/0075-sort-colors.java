// class Solution {
//     public void sortColors(int[] nums) {

//         int zeros = 0;
//         int ones = 0;
//         int n = nums.length;

//         // Count the number of 0s and 1s
//         for (int num : nums) {

//             if (num == 0) {
//                 zeros++;
//             }
//             else if (num == 1) {
//                 ones++;
//             }
//         }

//         // Fill 0s
//         for (int i = 0; i < zeros; i++) {
//             nums[i] = 0;
//         }

//         // Fill 1s
//         for (int i = zeros; i < zeros + ones; i++) {
//             nums[i] = 1;
//         }

//         // Fill 2s
//         for (int i = zeros + ones; i < n; i++) {
//             nums[i] = 2;
//         }
//     }
// }

class Solution {
    public int[] sortColors(int[] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }
}