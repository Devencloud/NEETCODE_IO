class MinStack {
    Deque<Integer> s=  new ArrayDeque<>();
    Deque<Integer> min=  new ArrayDeque<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        s.push(val);
        if(min.isEmpty() || val<=min.peek()){
            min.push(val);
        }
        
    }
    
    public void pop() {
        if(min.peek().equals(s.peek())){
            min.pop();
            s.pop();
        }
        else{
            s.pop();
        }
        
    }
    
    public int top() {
        return s.peek();
        
    }
    
    public int getMin() {
        return min.peek();
        
    }
}
