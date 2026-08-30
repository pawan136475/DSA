package coding_problems.cracckify;

//https://leetcode.com/problems/linked-list-cycle/description/
public class Code_141 {
    private ListNode head;
    private ListNode tail;
    int size = 0;

    public Code_141() {
        this.size = 0;
    }

    public static boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast != null && fast.equals(slow))
                return true;
        }
        return false;
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
        Code_141 node = new Code_141();
        node.insertFirst(-4);
        node.insertFirst(0);
        node.insertFirst(2);
        node.insertFirst(3);
        node.display();
        node.tail.next = node.head.next;
        System.out.println(node.hasCycle(node.head));
    }

}
