
import java.util.Stack;

public class LeetCode155 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());  //--> 返回 -3.
        minStack.pop();
        System.out.println(minStack.top());     //--> 返回 0.
        System.out.println(minStack.getMin());  //--> 返回 -2.
    }
}
//最小栈
class MinStack {

    private Stack<Integer> mStack;
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        mStack=new Stack<>();
        minStack=new Stack<>();
    }

    public void push(int x) {
        mStack.push(x);
        if (minStack.empty()||x<=minStack.peek())
            minStack.push(x);
    }

    public void pop() {
        if (mStack.peek().equals(minStack.peek()))
            minStack.pop();
        mStack.pop();
    }

    public int top() {
        return mStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
