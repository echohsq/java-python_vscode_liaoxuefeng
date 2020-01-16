/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
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
    // public ListNode reverseList(ListNode head) {
    //     if (head == null || head.next == null) {
    //         return head;
    //     }
    //     ListNode list = reverseList(head.next);
    //     head.next.next = head;
    //     head.next = null;
    //     return list;
    // }
    // public ListNode reverseList(ListNode head) {
        // ListNode pre = null;
        // ListNode curr = head;
        // while (curr != null) {
        //     ListNode currTemp = curr.next;
        //     curr.next = pre;
        //     pre = curr;
        //     curr = currTemp;
        // }
        // return pre;
    // }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode currTemp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = currTemp;
        }
        return pre;
    }
}
// @lc code=end

