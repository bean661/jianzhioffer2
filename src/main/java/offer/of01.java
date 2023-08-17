package offer;

import java.util.HashSet;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-16 17:50
 **/
public class of01 {

    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i])){
                return nums[i];
            }
            hashSet.add(nums[i]);
        }
        return -1;
    }    public int findRepeatNumber2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (i != nums[i]) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }

                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;

            }
        }
        return -1;
    }
}
