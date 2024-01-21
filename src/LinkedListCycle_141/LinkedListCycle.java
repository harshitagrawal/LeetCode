package LinkedListCycle_141;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head!=null){
        ListNode tmp1 = head, tmp2 = head.next;
        while(tmp2 != null && tmp2.next!=null ){
            tmp1 = tmp1.next;
            tmp2 = tmp2.next.next;
            if (tmp1 == tmp2) return true;
        }
        if (tmp1 == tmp2) return true;
        return false;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("testing");
    }
}

