package coding_problems.cracckify;

//https://leetcode.com/problems/merge-two-sorted-lists/description/
public class Code_21 {
    private ListNode head;
    private ListNode tail;
    int size = 0;


    public void insertFirst(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
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

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Code_21 node = new Code_21();
        node.insertFirst(1);
        node.insertFirst(2);
        node.insertFirst(3);
        node.insertFirst(4);
        node.display();
    }
}
