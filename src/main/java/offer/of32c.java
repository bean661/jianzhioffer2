package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-17 21:50
 **/
public class of32c {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        queue.add(root);
        int sum = 1;
        while (!queue.isEmpty()) {
            int k = queue.size();
            LinkedList<Integer> temp = new LinkedList<>();
            for (int i = 0; i < k; i++) {
                TreeNode node = queue.poll();
                if (sum % 2 == 1) {
                    temp.add(node.val);
                }else{
                    temp.addFirst(node.val);
                }

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            res.add(temp);
            sum++;
        }
        return res;
    }
}
