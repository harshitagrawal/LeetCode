package Q19_RemoveNthNodeFromEnd;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode P1 = head, P2 = head, prev = head;
        for(int i=0; i<n ;i++){
            P2 = P2.next;
        }
        while(P2!=null){
            prev = P1;
            P1 = P1.next;
            P2 = P2.next;
        }
        if(P1==head) return head.next;
        prev.next = P1.next;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5}; 
        int i;
        ListNode head = new ListNode();
        ListNode tmp = head;       
        for( i=0; i< arr.length-1 ; i++){
            tmp.val = arr[i];
            tmp.next = new ListNode();
            tmp = tmp.next; 
        }
        tmp.val = arr[i] ;
        ListNode result = removeNthFromEnd(head, 2);
        tmp = result;
        while(tmp!=null){
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
        
    }
}
