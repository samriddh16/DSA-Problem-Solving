import java.util.HashMap;
import java.util.Map;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class LinkL1_Remove0SumConsecNodesFromLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(0);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(-3);
//        head.next.next.next.next = new ListNode(-2);

        ListNode end = head;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        int prefixSum = 0;
        Map<Integer,ListNode> prefixMap = new HashMap<>();
        prefixMap.put(0,dummyHead);
        while(end!=null){
            prefixSum+=end.val;
            if(!prefixMap.containsKey(prefixSum)){
                prefixMap.put(prefixSum,end);
            }else{
                ListNode start = prefixMap.get(prefixSum);
                ListNode temp = start.next;
                int sum = prefixSum;
                while(temp!=end){
                    temp = temp.next;
                    sum+=temp.val;
                    prefixMap.remove(sum);
                }
                start.next = end.next;
            }
            end = end.next;
        }
        ListNode temp = dummyHead.next;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
}
