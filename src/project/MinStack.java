package project;
import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(Integer n) {
        stack.push(n);
        if(minStack.empty()||n <= minStack.peek()){
            minStack.push(n);
        }
    }


    public int min() {
        return  minStack.peek();
    }

    public void pop() {
        stack.pop();
        if(!minStack.empty()){
            minStack.pop();
        }
    }
}
