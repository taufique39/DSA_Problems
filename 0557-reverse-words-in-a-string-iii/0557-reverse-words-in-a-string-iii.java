class Solution {
    public String reverseWords(String s) {
        int start = 0;
        char[] arr = s.toCharArray();

        for(int i = 0; i <= arr.length; i++){
            if(i == arr.length || arr[i] == ' '){
                int left = start;
                int right = i - 1;

                while(left < right){
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                    left++;
                    right--;
                }
                start = i + 1;
            }
        }
        return new String(arr);
    }
}