package br.com.stack;

import java.util.Stack;

public class StackWithMin extends Stack<Integer>{

    private static final long serialVersionUID = -7743558087590648059L;

    private Stack<Integer> minStack;
    
    public StackWithMin() {
        minStack = new Stack<Integer>();
    }
    
    @Override
    public Integer push(Integer integer) {        
        if(minStack.isEmpty() || minStack.peek().compareTo(integer) >= 0) {
            minStack.push(integer);
        }
        return super.push(integer);
    }
    
    @Override
    public synchronized Integer pop() {
        if(minStack.peek().compareTo(this.peek()) == 0) {
            minStack.pop();
        }
        return super.pop();
    }
    
    public Integer min() {
        return minStack.peek();
    }
}
