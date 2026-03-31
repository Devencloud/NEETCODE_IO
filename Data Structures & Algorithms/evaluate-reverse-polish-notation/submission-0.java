class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> s = new ArrayDeque<>();
       
        int res = 0;
        for(String c: tokens){
            if(isOperator(c)){
                int n1 = s.pop();
                int n2= s.pop();
                res = calc(c,n2,n1);
                s.push(res);
            }
            else{
                s.push(Integer.parseInt(c));
            }
        }
        return s.peek();

        
    }
    public boolean isOperator(String c){
        return (c.equals("*") || c.equals("+") || c.equals("-") || c.equals("/"));
    }
    public int calc(String c,int n1,int n2){
        if(c.equals("*")){
            return n1*n2;
        }
        else if(c.equals("+")){
            return n1+n2;
        }
        else if(c.equals("-")){
            return n1-n2;
        }
        else if(c.equals("/")){
            return n1/n2;
        }
        
    throw new IllegalArgumentException("Invalid operator");
        
    }
}
