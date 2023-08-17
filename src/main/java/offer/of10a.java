package offer;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-16 19:51
 **/
public class of10a {
    int[] arr;
    public int fib(int n) {
        arr = new int[n+1];
        for (int i = 0; i <= n; i++) {
            arr[i] = -1;
        }
        return f(n);
    }

    public int f(int n) {
        if (n <= 1) {
            return n;
        }
        if (arr[n] != -1) {
            return arr[n];
        }
        int ans = (f(n - 1) + f(n - 2)) % 1000000007;
        arr[n] =ans;
        return ans;
    }
}
