package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-19 01:50
 **/
public class of57b {
    public int[][] findContinuousSequence(int target) {
        // 连续 数字 合   ||  滑动窗口
        List<int[]> res = new ArrayList<>();
        int i = 1;
        int j = target;
        int sum = 0;
        while (i <= target / 2) {
            if (target - sum > 0) {
                j++;
                sum = sum + j;
            } else if (target - sum < 0) {
                sum = sum - i;
                i++;
            }else{
                int[] temp = new int[j - i + 1];
                int count = 0;
                for (int k = i; k <= j; k++) {
                    temp[count++] = k;
                }
                res.add(temp);
                sum = sum - i;
                i++;
                j++;
                sum = sum + j;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
