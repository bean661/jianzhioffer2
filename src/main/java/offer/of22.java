package offer;

import java.security.Key;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-17 17:19
 **/
public class of22 {

    public ListNode getKthFromEnd(ListNode head, int k) {
        // 快慢指针
        ListNode slow = new ListNode(-1);
        slow.next = head;
        ListNode fast = slow;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.next;
    }
}
