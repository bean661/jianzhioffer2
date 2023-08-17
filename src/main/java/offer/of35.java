package offer;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-18 00:30
 **/
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class of35 {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }


        Node cur = head;
        //复制节点
        while (cur != null) {
            Node last = cur.next;
            cur.next = new Node(cur.val);
            cur.next.next = last;
            cur = last;
        }

        //处理random
        cur = head;
        while (cur != null) {
            Node temp = cur.next;
            temp.random = cur.random == null ? null : cur.random.next;
            cur =cur.next.next;
        }
        //拆分 a a1 b b1 c c1 d d1 ——》A b c d
        Node headNew = head.next;
        cur = head;
        Node curNew = headNew;
        while (cur != null) {
            cur.next = cur.next.next;
            cur =cur.next;

            curNew.next = cur == null ? null : cur.next;
            curNew = curNew.next;
        }
        return headNew;
    }
}
