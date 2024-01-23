package Q2_AddTwoNumbers;

class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

public class AddList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode tmp=result;
        int carry =0, sum;
        while(l1!=null || l2!=null || carry!= 0){
            int a = l1!=null ? l1.val : 0;
            int b = l2!=null ? l2.val : 0;
            sum = a + b + carry;
            carry = sum / 10;
            sum = sum % 10;
            //tmp.val = sum;
            tmp.next = new ListNode(sum);
            tmp= tmp.next;
            l1 = l1!=null ? l1.next: null;
            l2 = l2!=null ? l2.next: null;
        }
        return result.next;

    }
    public static void main(String[] args) {
        System.out.println("hello add numbers");
    }
}
