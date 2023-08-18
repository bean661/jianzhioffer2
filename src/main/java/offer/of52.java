package offer;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-18 21:44
 **/
public class of52 {

    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headB == null || headA == null) {
            return null;
        }
        ListNode h1 = headA;
        ListNode h2 = headB;

        while (h1 != h2) {
            h1 = h1 == null ? headB : h1.next;
            h2 = h2 == null ? headA : h2.next;
        }

        return h1;
    }

    ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headB == null || headA == null) {
            return null;
        }
        ListNode h1 = headA;
        ListNode h2 = headB;
        int l1 = 0;
        int l2 = 0;
        while (h1 != null){
            h1 = h1.next;
            l1 +=1;
        }

        while (h2 != null){
            h2 = h2.next;
            l2 +=1;
        }
        if (l1 - l2 > 0) {
            h1 = headA;
            h2 = headB;
        }
        else {
            h1 = headB;
            h2 =headA;
        }
        int len = l1 - l2 > 0 ? l1 - l2 : l2 - l1;
        for (int i = 0; i < len; i++) {
            h1 = h1.next;
        }
        while (h1 != null) {
            if (h1 == h2){
                return h1;
            }else{
                h1 = h1.next;
                h2 = h2.next;
            }
        }
        return null;
    }
}
