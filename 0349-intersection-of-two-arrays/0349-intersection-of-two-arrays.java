class  Solution {
    public int[] intersection(int[] nums1, int[] nums2){
        boolean[] seen = new boolean[1001];
        int[] temp = new int[1001];
        int index = 0;

        for(int num : nums1){
            seen[num] = true;
        }

        for(int num : nums2){
            if(seen[num]){
                temp[index++] = num;
                seen[num] = false;
            }
        }

        int[] result = new int[index];

        for(int i=0; i<index; i++){
            result[i] = temp[i];
        }
        return result;
    }
}


// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);

//         int[] temp = new int[Math.min(nums1.length, nums2.length)];
//         int i = 0, j = 0, index = 0;

//         while (i < nums1.length && j < nums2.length) {
//             if (nums1[i] == nums2[j]) {
//                 if (index == 0 || temp[index - 1] != nums1[i]) {
//                     temp[index++] = nums1[i];
//                 }
//                 i++;
//                 j++;
//             } else if (nums1[i] < nums2[j]) {
//                 i++;
//             } else {
//                 j++;
//             }
//         }

//         return Arrays.copyOf(temp, index);
//     }
// }