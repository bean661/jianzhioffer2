package offer;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-19 00:29
 **/
public class of55a {
    public int maxDepth(TreeNode root) {
        //二叉树的深度

        return  dfs(root);
    }

    int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return  Math.max(dfs(root.right) , dfs(root.left)) + 1;
    }
}
