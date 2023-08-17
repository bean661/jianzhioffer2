package offer;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-16 22:06
 **/
public class of15 {

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            n = n & (n - 1);
            sum++;
        }
        return sum;
    }
}
