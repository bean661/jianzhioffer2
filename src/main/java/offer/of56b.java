package offer;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-19 01:37
 **/
public class of56b {
    public int singleNumber(int[] nums) {
        int sum = 0;
        int m = 1;
        int[] arr = new int[32];
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & m) != 0) {
                    arr[i]++;
                }
            }
            arr[i] = arr[i] % 3;
            sum = sum + arr[i]*m;
            m = m << 1;
        }
        return sum;
    }
}
