class Solution {
    public String toGoatLatin(String sentence) {
        String[] k = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        int count = 1;
        for(String i : k){
            char ch = i.charAt(0);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                result.append(i);   
            }
            else{
                result.append(i.substring(1));
                result.append(ch); 
            }
            result.append("ma");
            for(int j=0; j<count; j++){
                result.append("a");
            }

            result.append(" ");
            count++;
        }
        return result.toString().trim();
    }
}