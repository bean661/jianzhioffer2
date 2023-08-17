package offer;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-16 22:19
 **/
public class of16 {
    public double myPow(double x, int n) {
        double res = 1;
        long y =  n;

        if (n < 0) {
            y = -y;
            x = 1 / x;
        }
        while (y > 0) {
            if (y % 2 == 1) {
                res = res * x;
            }

            x = x * x;
            y = y / 2;

        }

        return res;
    }
}
