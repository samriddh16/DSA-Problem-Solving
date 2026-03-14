class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2() {}

    ListNode2(int val) {
        this.val = val;
    }

    ListNode2(int val, ListNode2 next) {
        this.val = val;
        this.next = next;
    }
}

public class LinkL3_AddTwoNumbers_I {
    public static void printList(ListNode2 head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) {
        int carry=0,value=0;
        ListNode2 head = null;
        ListNode2 temp = null;
        while(l1 != null && l2 != null){
            value = l1.val+l2.val+carry;
            carry = value/10;
            if(value>=10){
                value=value%10;
            }
            if(head==null){
                head = new ListNode2(value);
                temp=head;
            }else{
                temp.next = new ListNode2(value);
                temp=temp.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            value = l1.val+carry;
            carry = value/10;
            if(value>=10){
                value=value%10;
            }
            if(head==null){
                head = new ListNode2(value);
                temp=head;
            }
            else{
                temp.next = new ListNode2(value);
                temp=temp.next;
            }
            l1 = l1.next;
        }
        while(l2!=null){
            value = l2.val+carry;
            carry = value/10;
            if(value>=10){
                value=value%10;
            }
            if(head==null){
                head = new ListNode2(value);
                temp=head;
            }
            else{
                temp.next = new ListNode2(value);
                temp=temp.next;
            }
            l2 = l2.next;
        }
        if(carry>0){
            temp.next = new ListNode2(carry);
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode2 l1 = new ListNode2(2);
        l1.next = new ListNode2(4);
        l1.next.next = new ListNode2(9);

        // Second number: 5 -> 6 -> 4  (represents 465)
        ListNode2 l2 = new ListNode2(5);
        l2.next = new ListNode2(6);
        l2.next.next = new ListNode2(4);
        l2.next.next.next = new ListNode2(9);

        ListNode2 result = addTwoNumbers(l1, l2);
        printList(result);
    }
}
