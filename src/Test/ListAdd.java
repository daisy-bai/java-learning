package Test;


import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class ListAdd {

    public static void main(String[] args) {


    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode p = l1, q = l2, curr = temp;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0)
            curr.next = new ListNode(carry);
        return temp.next;
    }

    public static PriorityQueue<Integer> addNum(ListNode l) {

        List<Integer> number1 = new ArrayList<>();
        ListNode temp1 = l.next;
        while (temp1 != null) {
            number1.add(temp1.val);
            temp1 = temp1.next;
        }
        return new PriorityQueue<Integer>(number1.size(), Collections.reverseOrder());
    }
}
