package offer;

import java.util.Stack;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-16 19:44
 **/
public class of09 {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public of09() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();


    }

    public void appendTail(int value) {

        stack1.push(value);

    }

    public int deleteHead() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        if (!stack1.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
        return -1;

    }

}
