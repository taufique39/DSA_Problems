class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            // int currentHeight = (i == n) ? 0 : heights[i];  --> 
            // Both are same(above line abn if else part)
            int currentHeight;
            if (i == n) {
                currentHeight = 0;
            } else {
                currentHeight = heights[i];
            }

            while (!stack.isEmpty() && heights[stack.peek()] > currentHeight) {
                int index = stack.pop();
                int height = heights[index];

                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }

            if (i < n) {
                stack.push(i);
            }
        }

        return maxArea;
    }
}
