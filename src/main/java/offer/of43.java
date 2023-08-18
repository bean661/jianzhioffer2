package offer;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-18 17:51
 **/
public class of43 {
    public int countDigitOne(int n) {
        long bit = 1;
        long sum = 0;

        while (bit <= n) {
            int cur = (int) ((n / bit) % 10);
            int low = (int) (n % bit);
            int high = (int) (n / bit / 10);

            if (cur > 1) {
                sum += (high + 1) * (bit);
            } else if (cur == 1) {
                sum += (high * bit) + (1 + low);
            }else {
                sum += high * bit;
            }
            bit = bit* 10;

        }
        return (int) sum;
    }
}
