class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];

        for (int i = 0; i < nums.length; i++) {

            /* Deque method	Meaning
                pollFirst()	- Front se element remove karo
                pollLast()	- Rear se element remove karo
                peekFirst()	- Front ka element dekho, remove mat karo
                peekLast()	- Rear ka element dekho, remove mat karo
                offerLast(i) - Rear mein element add karo
            */
            // Remove indices outside the current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements from the rear
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add current index
            deque.offerLast(i);

            // Store maximum when window size is reached
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}