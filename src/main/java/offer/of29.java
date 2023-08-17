package offer;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-17 20:33
 **/
public class of29 {

    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length <= 0 || matrix[0].length == 0) {
            return new int[0];
        }

        int t = 0, l = 0, r = matrix[0].length - 1, b = matrix.length - 1;
        int[] res = new int[(r + 1) * (b + 1)];
        int k = 0;
        while (true) {
            for (int i = t, j = l; j <= r; j++) {
                res[k++] = matrix[i][j];
            }
            t++;
            if(t>b) break;

            for (int i = t, j = r; i <= b; i++) {
                res[k++] = matrix[i][j];
            }
            r--;
            if(r < l) break;

            for (int i = b, j = r; j >= l; j--) {
                res[k++] = matrix[i][j];
            }
            b--;
            if(b < t) break;

            for (int i = b, j = l; i>=t; i--) {
                res[k++] = matrix[i][j];
            }
            l++;
            if (r < l) break;
        }
        return res;
    }
}
