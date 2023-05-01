package home_works.home_work_13.task_2;

public class Main {
    public static void main(String[] args) {
        ListNode sixth = new ListNode(6);
        ListNode fifth = new ListNode(5, sixth);
        ListNode fourth = new ListNode(4, fifth);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);
        Solution solution = new Solution();
        System.out.println(solution.reverseList(first));
    }
}
