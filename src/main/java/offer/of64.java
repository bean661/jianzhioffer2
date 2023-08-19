package offer;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-19 14:29
 **/
public class of64 {
    int sum = 0;

    public int sumNums(int n) {

        boolean falg = n >= 1 && sumNums(n -1 ) < 1;
        sum = sum + n;
        return sum;
    }
}
