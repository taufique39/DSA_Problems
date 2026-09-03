class Solution {

    public boolean detectCapitalUse(String word) {

        if (word.equals(word.toUpperCase())) {
            return true;
        }
        if (word.equals(word.toLowerCase())) {
            return true;
        }

        int count = 0;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }
        if (count == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }
        return false;
    }
}