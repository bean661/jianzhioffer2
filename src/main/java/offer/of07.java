package offer;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-16 19:24
 **/

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
public class of07 {
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        TreeNode node = f(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        return node;
    }

    public TreeNode f(int[] preorder, int l1, int r1, int[] inorder, int l2, int r2) {
        if (l1 > r1 && l2 > r2) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[l1]);
        int i = map.get(preorder[l1]);

        root.left = f(preorder, l1 + 1, l1 + i - l2, inorder, l2, i - 1);
        root.right = f(preorder, l1 + i - l2 + 1, r1, inorder, i + 1, r2);
        return root;
    }
}
