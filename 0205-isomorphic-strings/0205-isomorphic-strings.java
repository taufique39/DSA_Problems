class Solution {
    public boolean isIsomorphic(String s, String t) {

        int[] lasts = new int[256];
        int[] lastt = new int[256];

        for (int i = 0; i < s.length(); i++) {
            if (lasts[s.charAt(i)] != lastt[t.charAt(i)]) {
                return false;
            }
  
            lasts[s.charAt(i)] = i + 1;
            lastt[t.charAt(i)] = i + 1;
        }
        return true;
    }
}