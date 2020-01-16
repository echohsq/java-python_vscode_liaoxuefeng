/*
 * @lc app=leetcode.cn id=876 lang=java
 *
 * [876] 链表的中间结点
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
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int cnt = 1;
        ListNode list = head;
        while (head.next != null) {
            head = head.next;
            cnt ++;
            if (cnt % 2 == 0){
                list = list.next;
            }
        }
        return list;
    }
}
// @lc code=end

