class Node {
    int value;
    int min;

    public Node(int v, int m) {
        this.value = v;
        this.min = m;
    }
}
class MinStack {
    Stack<Node> stack;
    
    public MinStack() {
        stack = new Stack<Node>();
    }
    
    public void push(int value) {
        if(stack.isEmpty()){
            stack.push(new Node(value, value));
            return;
        }
        Node nodeTop = stack.peek();
        int minTop = nodeTop.min;

        if(value < minTop){
            stack.push(new Node(value, value));
        }
        else{
            stack.push(new Node(value, minTop));
        }
    }
    
    public void pop() {
        // if(stack.isEmpty()){
        //     return;
        // }
        stack.pop();
    }
    
    public int top() {
        if(stack.isEmpty()){
            return -1;
        }
        Node nodeTop = stack.peek();
        return nodeTop.value;
    }
    
    public int getMin() {
        if(stack.isEmpty()){
            return -1;
        }
        Node nodeTop = stack.peek();
        return nodeTop.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */