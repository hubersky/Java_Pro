package home_works.home_work_13.task_2;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode currentNode = head;
        ListNode newNode = null;
        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = newNode;
            newNode = currentNode;
            currentNode = nextNode;
        }
        return newNode;
    }
}
