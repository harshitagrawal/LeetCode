package Q24_SwapNodesInPairs;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public static ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }else if (head.next == null){
            return head;
        }
        else{
           ListNode curr, newHead;
           newHead = head.next; 
           curr = head.next.next;
            head.next.next = head;
            head.next = swapPairs(curr);
            return newHead;
        }
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
        ListNode result = swapPairs(head);
        tmp = result;
        while(tmp!=null){
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
        
    }
}
