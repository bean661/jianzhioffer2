package offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-19 12:16
 **/
public class of61 {
    public boolean isStraight(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = -1;
        int min = 20;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            } else if (set.contains(nums[i])) {
                return false;
            } else {
                set.add(nums[i]);
                max = Math.max(max, nums[i]);
                min = Math.min(min, nums[i]);
            }
        }

        return max - min < 5 ;
     }
}
