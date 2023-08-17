package offer;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-16 21:12
 **/
public class of13 {
    boolean[][] visited;
    public int movingCount(int m, int n, int k) {
        visited = new boolean[m][n];

        return dfs(m,n,0,0,k);
    }

    int dfs(int m, int n,int i, int j, int k) {
        if (i < 0 || i >= m || j < 0 || j >= n || k < sum(i) + sum(j) || visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        return 1 + dfs(m, n, i + 1, j, k) + dfs(m, n, i - 1, j, k) + dfs(m, n, i, j - 1, k) + dfs(m, n, i, j + 1, k);


    }

    int sum(int i) {
        int res = 0;
        while (i != 0) {
            res  += i % 10;
            i = i / 10;
        }

        return res;
    }
}
