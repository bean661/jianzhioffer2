package offer;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-17 18:36
 **/
public class of25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null){
            return l1;
        }

        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                node.next = l1;
                l1 = l1.next;
            }else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }

        node.next = l1 != null ? l1 : l2;

        return dummy.next;
    }
}
