package offer;

import java.util.PriorityQueue;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-18 15:07
 **/
public class of40 {

    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length <= 0 || k == 0 || arr.length == 0) {
            return new int[0];
        }

        PriorityQueue<Integer> d = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            d.add(arr[i]);
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = d.poll();
        }

        return res;
    }
}
