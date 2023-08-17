package offer;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-17 17:13
 **/
public class of21 {

    public int[] exchange(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return nums;
        }

        int i = 0;
        int j = nums.length -1;
        while (i < j) {
            while(i < j && nums[i] % 2 != 0 ) i++;
            while(i < j && nums[j] % 2 != 1) j--;

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        return nums;

    }
}
