class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if (typed.length() < name.length()) {
            return false;
        }

        int n = 0;
        int t = 0;
        char ch = '0';

        while (t < typed.length()) {
            if (n < name.length() && name.charAt(n) == typed.charAt(t)) {
                ch = name.charAt(n);

                n++;
                t++;
            }
            else if (typed.charAt(t) == ch) {
                t++;
            }
            else {
                return false;
            }

        }

        if (n < name.length()) {
            return false;
        }

        return true;
    }
}