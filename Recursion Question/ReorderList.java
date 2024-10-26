public class ReorderList {
    public static void main(String[] args) {

    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public static ListNode currentNode ;
  public void reOrderList(ListNode head){
      currentNode = head;
      solve(head);
  }

  public static void solve(ListNode head){
      if(head == null){
          return;
      }

      solve(head.next);

      ListNode temp = currentNode.next;
      if(temp == null){
          return;
      }else if(currentNode == temp){
          head.next = null;
          return;
      }
      currentNode.next = head;
      head.next = temp == head ? null : temp;
      currentNode = temp;
  }
}
