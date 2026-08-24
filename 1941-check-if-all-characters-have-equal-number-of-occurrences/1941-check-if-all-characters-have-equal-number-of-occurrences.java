class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }
        
        int x = 0;
        for(int i = 0; i <26; i++){
            if(count[i] != 0){
                x = count[i];
            }
        }
        for(int i = 0; i < 26; i++){
            if(count[i] != 0 && count[i] != x){
                return false;
            }
        }
        return true;
    }
}