package offer;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-19 00:34
 **/
public class of55b {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }


        int left = dfs(root.left);
        int right = dfs(root.right);

        return Math.abs(right - left) <= 1 ? isBalanced(root.left) && isBalanced(root.right) : false;

    }

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
