package Q160_IntersectionOfTwoLinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class Solution {
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0, lengthB = 0;
        ListNode tmpA = headA, tmpB = headB;
        while(tmpA!=null){
            lengthA++;
            tmpA = tmpA.next;
        }
        while(tmpB!=null){
            lengthB++;
            tmpB = tmpB.next;
        }
        tmpA = headA; tmpB = headB;
        while(lengthA>lengthB){
            tmpA = tmpA.next;
            lengthA--;
        }
        while(lengthB>lengthA){
            tmpB = tmpB.next;
            lengthB--;
        }
        while(tmpA!=null && tmpB!=null){
            if(tmpA == tmpB) return tmpA;
            else{
                tmpA = tmpA.next;
                tmpB = tmpB.next;
            }
        }
        return null;
    }

}
