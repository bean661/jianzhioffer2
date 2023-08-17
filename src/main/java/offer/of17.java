package offer;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-17 11:55
 **/
public class of17 {

    public int[] printNumbers(int n) {
        int sum = (int) Math.pow(10, n);
        int[] res = new int[sum-1];
        for (int i = 1; i < sum; i++) {
            res[i-1] = i;
        }
        return res;
    }
}
