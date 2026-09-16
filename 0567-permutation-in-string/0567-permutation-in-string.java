// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         int a = s1.length();
//         int b = s2.length();

//         if (a > b) {
//             return false;
//         }

//         int[] s1_freq = new int[26];
//         int[] s2_freq = new int[26];

//         for (char ch : s1.toCharArray()) {
//             s1_freq[ch - 'a']++;
//         }

//         int i = 0;
//         int j = 0;

//         while (j < b) {
//             s2_freq[s2.charAt(j) - 'a']++;

//             if (j - i + 1 > a) {
//                 s2_freq[s2.charAt(i) - 'a']--;
//                 i++;
//             }

//             if (Arrays.equals(s1_freq, s2_freq)) {
//                 return true;
//             }

//             j++;
//         }

//         return false;
//     }
// }
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

        int[] a = new int[26];
        int[] b = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            a[s1.charAt(i) - 'a']++;
            b[s2.charAt(i) - 'a']++;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            if (Arrays.equals(a, b))
                return true;

            b[s2.charAt(i) - 'a']++;
            b[s2.charAt(i - s1.length()) - 'a']--;
        }

        return Arrays.equals(a, b);
    }
}
// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         int a = s1.length();
//         int b = s2.length();

//         if (a > b) {
//             return false;
//         }

//         char[] x = s1.toCharArray();
//         Arrays.sort(x);
//         s1 = new String(x);

//         for (int i = 0; i <= b - a; i++) {
//             String substring = s2.substring(i, i + a);

//             char[] y = substring.toCharArray();
//             Arrays.sort(y);
//             substring = new String(y);

//             if (s1.equals(substring)) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }