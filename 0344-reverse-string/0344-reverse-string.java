class Solution {
    public void reverseStringHelper(char[] s, int start, int end){
        
        if(start >= end){       //base case
            return;
        }

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        reverseStringHelper(s, start+1, end-1);
    }
    public void reverseString(char[] s){
    reverseStringHelper(s, 0, s.length-1);

    }
    // public void reverseString(char[] s) {
    //     int start = 0;
    //     int end = s.length-1;

    //     while(start < end){
    //         char temp = s[start];
    //         s[start] = s[end];
    //         s[end] = temp;

    //         start++;
    //         end--;
    //     }
        
    // }
}