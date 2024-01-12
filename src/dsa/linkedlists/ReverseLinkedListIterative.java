package dsa.linkedlists;

public class ReverseLinkedListIterative {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        check(head);
    }

    private static Node check(Node head) {
        if(head == null || head.next==null)
            return head;
        Node curr = head;
        Node prev = null;
        Node temp = head;
        while (curr.next !=null){
            prev = curr;
            curr = curr.next;
            temp = curr;

        }
        return head;
    }
}
