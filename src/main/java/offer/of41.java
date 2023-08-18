package offer;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-18 16:12
 **/
public class of41 {

    Queue<Integer> min;
    Queue<Integer> max;

    public of41() {
        min = new PriorityQueue<>();
        max = new PriorityQueue<>(Comparator.reverseOrder());

    }

    public void addNum(int num) {
        if (max.size() == min.size()) {
            min.add(num);
            max.add(min.poll());
        }else {
            max.add(num);
            min.add(max.poll());
        }

    }

    public double findMedian() {
        if (max.size() == min.size()) {
            return  (min.peek() + max.peek()) / 2.0;
        }else {
            return max.peek() * 1.0;

        }

    }
}
