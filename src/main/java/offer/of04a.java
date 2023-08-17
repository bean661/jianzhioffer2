package offer;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-16 21:44
 **/
public class of04a {
    //主要看能切成多少个3 因为3的时候得到的面积最大
    public int cuttingRope(int n) {
        if (n <= 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }

        int res = n/3;
        int mod = n % 3;

        if (mod == 0) {
            return pow(3, res);
        } else if (mod == 1) {
            return pow(3,res - 1) * 4;
        } else return pow(3, res) * 2;



    }

    int pow(int a, int x) {
        int ans = 1;
        while (x != 0) {
            ans = ans * a;
            x--;
        }
        return ans;
    }
}
