package Q1472_DesignBrowserHistory;

class ListNode{
    String url;
    ListNode next;
    ListNode prev;
    public ListNode(String url){
        this.url = url;
        this.next = null;
        this.prev = null;
    }
}


class BrowserHistory {
    ListNode head, curr;
    public BrowserHistory(String homepage) {
        head = new ListNode(homepage);
        curr = head;
    }
    
    public void visit(String url) {
        ListNode prevTemp = curr;
        curr.next = new ListNode(url);
        curr = curr.next;
        curr.prev = prevTemp;
    }
    
    public String back(int steps) {
        while(steps>0 && curr.prev!=null){
            curr = curr.prev;
            steps--;
        }
        return curr.url;

    }
    
    public String forward(int steps) {
        while(steps>0 && curr.next!=null){
            curr = curr.next;
            steps--;
        }
        return curr.url;
    }
}

class Solution{
    public static void main(String[] args) {
        System.out.println("test");
    }
}
/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */