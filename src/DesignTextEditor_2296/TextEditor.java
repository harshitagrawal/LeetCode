package DesignTextEditor_2296;

class ListNode {
    char val;
    ListNode next;
    ListNode prev;
    ListNode() {}
    
}

class TextEditor {
  
  ListNode head, cursor;
  public TextEditor() {
      head = new ListNode();
      head.next = null;
      head.prev = null;
  }
  
  public void addText(String text) {
      
  }
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, Text Editor!");
}
  
}

/**
* Your TextEditor object will be instantiated and called as such:
* TextEditor obj = new TextEditor();
* obj.addText(text);
* int param_2 = obj.deleteText(k);
* String param_3 = obj.cursorLeft(k);
* String param_4 = obj.cursorRight(k);
*/



