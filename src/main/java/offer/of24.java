package offer;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-17 18:29
 **/
public class of24 {
    public ListNode reverseList(ListNode head) {
        //
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return temp;

    }
}
