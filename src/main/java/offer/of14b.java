package offer;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-16 21:56
 **/
public class of14b {
    public int cuttingRope(int n) {
        if (n <= 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int p = 1000000007;
        int res = n/3;
        int mod = n % 3;

        if (mod == 0) {
            return (int)pow(3, res);
        } else if (mod == 1) {
            return (int)(pow(3,res - 1) * 4 % p);
        } else return (int)(pow(3, res) * 2 % p);



    }

    long pow(int a, int x) {
        long ans = 1;
        int p = 1000000007;
        for (int i = 0; i < x; i++) {
            ans = (ans * a) % p;
        }
        return ans;
    }
}
