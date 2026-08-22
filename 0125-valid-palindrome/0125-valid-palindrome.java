class Solution {
    public boolean isPalindrome(String s) {
        String lower_s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        if(lower_s.equals(new StringBuilder(lower_s).reverse().toString())){
            return true;
        }
    return false;
    }
}