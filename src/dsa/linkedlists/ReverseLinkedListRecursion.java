package dsa.linkedlists;
/*Recursive*/
public class ReverseLinkedListRecursion {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        check(head);
    }

    private static Node check(Node head) {
        if(head.next==null)
            return head;
        Node curr = check(head.next);
        head.next.next = head;
        head.next = null;
        return curr;
    }
}
