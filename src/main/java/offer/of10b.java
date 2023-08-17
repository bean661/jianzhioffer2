package offer;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-16 20:08
 **/
public class of10b {
    int[] arr;
    public int numWays(int n) {
        arr = new int[n+1];
        for (int i = 0; i < n + 1; i++) {
            arr[i] = -1;
        }
        return num(n);
    }

    private int num(int n) {
        if (n <= 1) {
            return 1;
        }
        if (arr[n] != -1) {
            return arr[n];
        }

        int ans = (num(n-1) + num(n-2))%1000000007;
        arr[n] = ans;
        return ans;
    }
}
