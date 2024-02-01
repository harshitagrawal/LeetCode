package Q61_RotateList;

 // Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public static ListNode rotateRight(ListNode head, int k) {

        // Naive Approach
        // if(k==0 || head==null || head.next==null) return head;
        // ListNode secondLast = head;
        // while(secondLast.next.next !=null){
        //     secondLast = secondLast.next;
        // }
        // secondLast.next.next = head;
        // head = secondLast.next;
        // secondLast.next = null;
        // return rotateRight(head, k-1);
        
        if(k==0 || head==null || head.next==null) return head;
        int length = 0, n, split;
        ListNode tmp = head, last = head;
        while(tmp!=null){
            length++;
            last = tmp;
            tmp = tmp.next;
            
        }
        split = length - k%length;
        split = (split > 0)? split : split*-1;
        tmp = head;
        while(split > 1){
            tmp = tmp.next;
            split--;
        }
        last.next = head;
        head = tmp.next;
        tmp.next = null;
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
        ListNode result = rotateRight(head, 2);
        tmp = result;
        while(tmp!=null){
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
        
    }
}