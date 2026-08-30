package LinkedListConcept;

public class DLL {

    private Node head;
    private int size;


    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int val) {

        Node insertLast = new Node(val);
        Node last = head;
        insertLast.next = null;
        if (head == null) {
            insertLast.prev = null;
            head = insertLast;
            size++;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = insertLast;
        insertLast.prev = last;
        insertLast.next = null;
        size++;
    }

    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.val + "->");
            last = temp;
            temp = temp.next;
        }
        System.out.println(
                "END");
        //print in reverse order
        while (last != null) {
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println(
                "END");
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = get(index);
        Node node2 = temp.prev;

        newNode.next = temp;
        temp.prev = newNode;
        node2.next = newNode;
        newNode.prev = node2;
        size++;
    }

    //delete first
    public int deleteFirst() {
        if (head == null) {
            return 0;
        }
        int val = head.val;
        Node temp = head.next;
        temp.prev = null;
        head.next = null;
        head = temp;
        size--;
        return val;
    }

    //delete last
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = secondLast.next.val;
        secondLast.next.prev = null;
        secondLast.next = null;
        size--;
        return val;

    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node node = get(index - 1);
        int val = node.val;
        node.next.next.prev = node;
        node.next = node.next.next;
        size--;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }
}
