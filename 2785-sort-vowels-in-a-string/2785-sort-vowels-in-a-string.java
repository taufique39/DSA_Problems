class Solution {
    public String sortVowels(String s) {
        Set<Character> vowels = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        int[] count = new int[128];
        for(char ch : s.toCharArray()){
            if(vowels.contains(ch)){
                count[ch]++;
            }
        }
        StringBuilder result = new StringBuilder();
        int index = 0;
        for(char ch : s.toCharArray()){
            if(vowels.contains(ch)){
                while(index < 128 && count[index] == 0){
                    index++;
                }
                result.append((char) index);
                count[index]--;
            }
            else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}