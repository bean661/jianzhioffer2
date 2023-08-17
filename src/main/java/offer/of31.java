package offer;

import java.util.Stack;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-17 21:22
 **/
public class of31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed == null || pushed.length <= 0) {
            return true;
        }
        int k = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while(!stack.isEmpty() && stack.peek().intValue() == popped[k]){
                k++;
                stack.pop();
            }
        }

        return stack.isEmpty();

    }
}
