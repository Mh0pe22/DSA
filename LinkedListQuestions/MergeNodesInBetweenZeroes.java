import java.util.List;

public class MergeNodesInBetweenZeroes {
    public static void main(String[] args) {
        ListNode head = new ListNode(11);
        ListNode second = new ListNode(22);
        ListNode third = new ListNode(33 , null);
        head.next = second;
        second.next = third;
    }

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){}

        ListNode (int val){
            this.val = val;
        }

        ListNode(int val , ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeNodes(ListNode head){
//        if(head == null){
//            return null;
//        }
//
//        ListNode node = head;
//        if(node.next != null && node.next.val != 0){
//            head = node.next;
//        }
//
//        while (node.next != null){
//            int sum = 0;
//            if(node.val == 0){
//                sum = sumHelper(node);
//            }
//            node = node.next;
//        }
//        return head;
        ListNode node = head.next;
        ListNode a = new ListNode(0);
        ListNode b = a;

        int sum = 0;

        while(node != null){
            if(node.val != 0){
                sum += node.val;
            }else{
                b.next = new ListNode(sum);
                b = b.next;
                sum = 0;
            }
            node = node.next;
        }

        return a.next;
    }

//    public static int  sumHelper(ListNode node){
//        int sum = 0;
//        if(node.val == 0){
//            while (node.next!= null && node.next.val > 0){
//                sum = node.val;
//                node = node.next;
//            }
//        }
//
//        return sum ;
//    }
}
