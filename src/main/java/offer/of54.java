package offer;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Stream;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-19 00:20
 **/
public class of54 {
    int k = 0;
    int target = 0;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;

        inOrder(root);
        return target;
    }

    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.right);
        k--;
        if (k == 0) {
            target = root.val;
            return;
        }
        inOrder(root.left);
    }


    PriorityQueue<Integer> tree;
    public int kthLargest2(TreeNode root, int k) {
        tree  = new PriorityQueue<>(Comparator.reverseOrder());

        dfs(root);
        for (int i = 0; i < k-1; i++) {
            tree.poll();
        }
        return tree.poll();
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        tree.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}
