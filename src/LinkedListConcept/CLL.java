package LinkedListConcept;

public class CLL {

    int size;
    private Node head;
    private Node tail;

    public CLL() {
        this.size = 0;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        Node temp = head;
        do {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        while (temp != head);
        System.out.println("HEAD");
    }

    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }
        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node next, int val) {
            this.next = next;
            this.val = val;
        }
    }
}
