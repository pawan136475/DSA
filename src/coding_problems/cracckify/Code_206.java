package coding_problems.cracckify;

//https://leetcode.com/problems/reverse-linked-list/description/
public class Code_206 {
    private ListNode head;
    private ListNode tail;
    int size = 0;

    public static ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    //Node formation
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public void insertFirst(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        ListNode node = new ListNode(val);

        if (tail == null) {
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        Code_206 node = new Code_206();
        node.insertFirst(1);
        node.insertFirst(2);
        node.insertFirst(3);
        node.insertFirst(4);
        node.display();
        node.head = node.reverseList(node.head);
        node.display();
    }

}

