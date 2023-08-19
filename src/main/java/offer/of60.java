package offer;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-19 11:56
 **/
public class of60 {
    public double[] dicesProbability(int n) {
        int[][] dp = new int[n + 1][6 * n + 1];

        // 初始化第一行
        for (int i = 1; i <= 6; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i < n + 1; i++) {
            for (int j = i; j < 6 * i + 1; j++) {
                for (int k = 1; k < 6 + 1; k++) {
                    if (j < k) {
                        break;
                    }
                    dp[i][j] += dp[i - 1][j - k];
                }
            }
        }
        double[] res = new double[5 * n + 1];
        int index = 0;
        double sum = Math.pow(6, n);

        for (int i = n; i <= 6 * n; i++) {
            res[index++] = dp[n][i] /sum;
        }

        return res;

    }
}
