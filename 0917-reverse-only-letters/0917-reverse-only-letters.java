class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if ((arr[left] < 'A') || (arr[left] > 'Z' && arr[left] < 'a') || (arr[left] > 'z')){
                left++;
            } 
            else if ((arr[right] < 'A') || (arr[right] > 'Z' && arr[right] < 'a') || (arr[right] > 'z')){
                right--;
            }
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        
        }

        return new String(arr);
    }
}