class Solution {
    public int evalRPN(String[] tokens) {
        String expression = "+-*/";

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<tokens.length; i++){
            String token = tokens[i];

            if(expression.contains(token)){
                int n2 = stack.pop();
                int n1 = stack.pop();

                int val = 0;
                switch(token){
                    case "+":
                        val = n1 + n2;
                        break;
                    case "-":
                        val = n1 - n2;
                        break;
                    case "*":
                        val = n1 * n2;
                        break;
                    case "/":
                        val = n1 / n2;
                        break;
                }
                stack.push(val);
            }
            else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}