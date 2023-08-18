package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-18 12:34
 **/
public class of38 {
    List<Character> path;
    List<String> res;

    boolean[] visited;


    public String[] permutation(String s) {
        this.visited = new boolean[s.length()];
        this.path = new ArrayList<>();
        this.res = new ArrayList<>();

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        dfs(chars, 0);
        String[] ans = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;

    }

    private void dfs(char[] chars, int k) {
        if (k == chars.length) {
            res.add(charToString(path));
            return;
        }

        // n叉树 搜索
        for (int i = 0; i < chars.length; i++) {
            //剪枝
            if (i > 0 && chars[i] == chars[i - 1] && visited[i - 1] == false) {
                continue;
            }

            if (visited[i] == false) {
                //递归访问
                visited[i] = true;
                path.add(chars[i]);
                dfs(chars, k + 1);
                path.remove(path.size() - 1);
                visited[i] = false;


            }

        }
    }
    private String charToString(List<Character> path) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < path.size(); i++) {
            builder.append(path.get(i));
        }
        return builder.toString();
    }

}
