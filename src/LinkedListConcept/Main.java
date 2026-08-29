package LinkedListConcept;

public class Main {
    public static void main(String[] args) {
        LL linkedList = new LL();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertLast(5);
        //linkedList.insert(7, 2);
        //linkedList.deleteFirst();
        //linkedList.deleteLast();
        //System.out.println(linkedList.delete(2));
        System.out.println(linkedList.findNode(3));
        linkedList.display();
    }
}
