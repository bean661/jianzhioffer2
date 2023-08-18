package offer;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-18 14:48
 **/
public class of39 {

    public int majorityElement(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }

        int x = nums[0];
        int sum = 1;
        for (int i = 1; i < nums.length; i++) {
            if (sum == 0) {
                x = nums[i];
                sum = 1;
            }else{
                if (x == nums[i]) {
                    sum++;
                }else {
                    sum--;
                }
            }
        }
        return  x;
    }
}
