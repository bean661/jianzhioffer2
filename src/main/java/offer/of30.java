package offer;

import java.util.Stack;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-17 21:03
 **/
public class of30 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public of30() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
        if (stack2.isEmpty() || (!stack2.isEmpty() && stack2.peek().intValue() >= x)) {
            stack2.push(x);
        }
    }

    public void pop() {
        if (!stack1.isEmpty()) {
            if (stack1.peek().intValue() == stack2.peek().intValue()) {
                stack2.pop();
            }
            stack1.pop();
        }


    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}
