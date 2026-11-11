class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);

            while(true){
                if(k == 0){
                    stack.push(c);
                    break;
                }

                if(stack.isEmpty()){
                    stack.push(c);
                    break;
                }

                int cTop = stack.peek();
                if(c < cTop){
                    stack.pop();
                    k = k-1;
                }
                else{
                    stack.push(c);
                    break;
                }
            }
        }

         while(k > 0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }

        char[] result = new char[stack.size()];
        int i = result.length-1;

        while(i >= 0){
            result[i] = stack.pop();
            i = i-1;
        }

        //if result : 001219
        i = 0;
        while(i < result.length && result[i] == '0'){ //this removes leading zeroes...
            i = i+1;
        }

        StringBuilder result2 = new StringBuilder();
        while(i < result.length){
            result2.append(result[i]);
            i = i+1;
        }

        if(result2.length() == 0){
            return "0";
        }
        return result2.toString();
    }
}