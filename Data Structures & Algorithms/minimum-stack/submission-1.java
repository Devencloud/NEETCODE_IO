class MinStack {
    Deque<Integer> s=  new ArrayDeque<>();
    Deque<Integer> min=  new ArrayDeque<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        s.push(val);
        if(!min.isEmpty()){
            min.push(Math.min(val,min.peek()));
        }
        else{
            min.push(val);
        }
        
    }
    
    public void pop() {
        
            min.pop();
            s.pop();
        
        
        
    }
    
    public int top() {
        return s.peek();
        
    }
    
    public int getMin() {
        return min.peek();
        
    }
}
