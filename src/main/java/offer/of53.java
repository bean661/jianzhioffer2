package offer;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-19 00:13
 **/
public class of53 {
    public int missingNumber(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while (i < j) {
            int mid = (j - i) / 2 + i;
            if (nums[mid] != mid) {
                j = mid;
            }else {
                i = mid + 1;
            }
        }
        return nums[j] == j ? j + 1 : i;
    }
}
