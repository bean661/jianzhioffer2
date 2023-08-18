package offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-18 10:57
 **/

public class of36 {
    Queue<Node> queue = new LinkedList<>();
    public Node treeToDoublyList(Node root) {
        //中序遍历
        if (root == null) {
            return null;
        }


        inOrder(root);
        Node head = queue.poll();
        Node pre = head;
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            pre.right = cur;
            cur.left = pre;
            pre = cur;
        }
        pre.right = head;
        head.left = pre;

        return head;
    }

    void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        queue.add(root);
        inOrder(root.right);
    }


    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };
}
