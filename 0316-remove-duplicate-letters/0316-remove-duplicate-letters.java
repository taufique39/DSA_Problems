class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        Stack<Character> stk = new Stack<>();
        boolean[] seen = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (seen[ch - 'a']) {
                count[ch - 'a']--;
                continue;
            }

            while (!stk.empty() && stk.peek() > ch && count[stk.peek() - 'a'] > 0) {
                seen[stk.peek() - 'a'] = false;
                stk.pop();
            }

            stk.push(ch);
            seen[ch - 'a'] = true;
            count[ch - 'a']--;

        }

        StringBuilder result = new StringBuilder();

        while (!stk.empty()) {
            result.append(stk.pop());
        }
        result.reverse();

        return result.toString();
    }
}