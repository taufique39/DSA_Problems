class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            while (!st.isEmpty() && k > 0 && st.peek() > num.charAt(i)) {
                st.pop();
                k--;
            }

            st.push(num.charAt(i));
        }

        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        StringBuilder result = new StringBuilder();

        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        result.reverse();

        int i = 0;
        while (i < result.length() && result.charAt(i) == '0') {
            i++;
        }

        result = new StringBuilder(result.substring(i));

        if (result.length() == 0) {
            return "0";
        }

        return result.toString();
    }
}