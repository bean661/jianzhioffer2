package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-17 23:57
 **/
public class of34 {
    List<List<Integer>> res;
    List<Integer> tmp;
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        res = new ArrayList<>();
        tmp = new ArrayList<>();
        f(root, target);

        return res;
    }

    private void f(TreeNode root, int target) {
        if (root == null) {
            return;
        }
        tmp.add(root.val);
        target = target - root.val;
        if (root.left == null && root.right == null && target == 0) {
            res.add(new ArrayList<>(tmp));
        }

        f(root.left,target);
        f(root.right, target);

        tmp.remove(tmp.size() - 1);


    }
}
