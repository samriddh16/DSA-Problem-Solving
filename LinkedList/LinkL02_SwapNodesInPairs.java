class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1() {}
    ListNode1(int val) { this.val = val; }
    ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
}

public class LinkL2_SwapNodesInPairs {
    public static ListNode1 swapPairs(ListNode1 node1, ListNode1 node2) {
        if(node1 == null) return node2;
        if(node2 == null) return node1;
        ListNode1 temp1 = null,temp2 = null;
        if(node2.next!=null){
           temp1 = node2.next;
           temp2 = node2.next.next;
        }
        node2.next = node1;
        node1.next = swapPairs(temp1, temp2);
        return node2;
    }

    public static void printList(ListNode1 head) {
        ListNode1 curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode1 head = new ListNode1(1);
        head.next = new ListNode1(2);
        head.next.next = new ListNode1(3);
        head.next.next.next = new ListNode1(4);
        head.next.next.next.next = new ListNode1(5);
        head.next.next.next.next.next = new ListNode1(6);
        
        ListNode1 result = swapPairs(head, head.next);
        printList(result);
    }
}
