/*
 * @lc app=leetcode.cn id=25 lang=java
 *
 * [25] K 个一组翻转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode dumy = new ListNode(-1);
        dumy.next = head;
        ListNode pre = dumy;
        ListNode tail = dumy;
        while (true) {
            int count = 0;
            while (count != k && tail != null) {
                count++;
                tail = tail.next;
            }
            if (tail == null ) break;
            ListNode head1 = pre.next;
            while (pre.next != tail) {
                ListNode cur = pre.next;
                pre.next = cur.next;
                cur.next = tail.next;
                tail.next = cur;
            }
            pre = head1;
            tail = head1;
        }
        return dumy.next;
    }
}
// @lc code=end

