package offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-18 11:13
 **/
public class of37 {

    public String serialize(TreeNode root) {
        // 层次便利
        if (root == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp != null) {
                queue.add(temp.left);
                queue.add(temp.right);
                builder.append(temp.val + ",");
            }else{
                builder.append("null,");
            }
        }
        System.out.println(builder.toString());
        return builder.toString();

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.length() <= 0) {
            return null;
        }

        String[] s = data.split(",");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node = new TreeNode(Integer.parseInt(s[0]));
        queue.add(node);
        int i =1;
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            //生成左子树
            if (!s[i].equals("null")) {
                TreeNode left = new TreeNode(Integer.parseInt(s[i]));
                cur.left = left;
                queue.add(left);
            }
            i++;

            // 生成右子树
            if (!s[i].equals("null")) {
                TreeNode right = new TreeNode(Integer.parseInt(s[i]));
                cur.right = right;
                queue.add(right);
            }
            i++;

        }

        return node;
    }

}
