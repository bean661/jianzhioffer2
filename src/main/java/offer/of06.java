package offer;

import java.util.List;
import java.util.Stack;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-16 18:44
 **/



class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class of06 {
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[]{};
        }

        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int[] res = new int[count];

        while (head != null) {
            res[--count] = head.val;
            head = head.next;
        }
        return res;
    }
}
