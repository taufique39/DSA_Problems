// class Solution {
//     public String removeDuplicates(String s) {
//         StringBuilder result = new StringBuilder();

//         for (char ch : s.toCharArray()) {
//             int n = result.length();

//             if (n > 0 && result.charAt(n - 1) == ch) {
//                 result.deleteCharAt(n - 1);
//             } else {
//                 result.append(ch);
//             }
//         }

//         return result.toString();
//     }
// }


class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }
}