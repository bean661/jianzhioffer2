package offer;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-18 18:14
 **/
public class of44 {
    public int findNthDigit(int n) {
        if (n == 0) {
            return 0;
        }

        long bit = 1;
        int i = 1;
        long count = 9;
        while (count < n) {
            n = (int) (n - count);
            bit = bit * 10;
            i++;
            count = bit * i * 9;
        }
        // 找到bit i
        // 确定是在这个区间的哪个数
        long num = bit + (n -1)/i;
        //确定num 在哪个字符  第几位
        int index = (n - 1) % i + 1;

        int res = (int) ((num /Math.pow(10,i-index))%10);

        return res;
    }
}
