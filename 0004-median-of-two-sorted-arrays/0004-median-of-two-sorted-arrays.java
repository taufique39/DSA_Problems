class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];

        int k = 0;
        // add nums1
        for(int i : nums1){
            result[k++] = i;
        }
        // add nums2
        for( int i : nums2){
            result[k++] = i;
        }

        Arrays.sort(result);

        int length = result.length;

        if(length % 2 == 0){
            double median = (result[(length / 2) - 1] + result[length / 2]) / 2.0;
            return median;
        } 
        else {
            double median = result[length / 2];
            return median;
        }
    }
}