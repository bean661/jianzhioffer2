package offer;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-17 12:00
 **/
public class of18 {

    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        temp.next = head;

        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }

        return dummy.next;
    }
}
