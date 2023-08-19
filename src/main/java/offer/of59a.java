package offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-19 10:26
 **/
public class of59a {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
        //输出: [3,3,5,5,6,7]
        if (nums.length <= 0 || k <= 0) {
            return new int[0];
        }
        int[] res = new int[nums.length - k + 1];
        int count = 0;
        // 定义栈 存储下标
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            // 看栈顶 如果小于当前值 就一直移除
            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) {
                queue.pollLast();
            }
            queue.add(i);
            // 清除不在窗口内的
            if (queue.peekLast() - k > queue.peek()) {
                queue.poll();
            }
            // 什么时候开始加入结果集 当 i + 1 》= k 时
            if (i + 1 >= k) {
                res[count++] = nums[queue.peek()];
            }



        }
        return res;

    }
}
