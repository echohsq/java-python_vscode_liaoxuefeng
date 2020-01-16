/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第N个节点
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
    // 使用反转链表法
    // public ListNode removeNthFromEnd(ListNode head, int n) {
    //     if (head == null || head.next == null) {
    //         return null;
    //     }
    //     ListNode p = reverseList(head);
    //     // 删除列表最好创建一个哨兵
    //     ListNode list = new ListNode(-1);
    //     list.next = p;
    //     ListNode q = list;
    //     for (int i = 1; i< n; i++) {
    //         q = q.next;
    //     }
    //     q.next = q.next.next;
    //     return reverseList(list.next);
    // }
    // public ListNode reverseList(ListNode head) {
    //     ListNode prev = null;
    //     ListNode curr = head;
    //     while (curr != null) {
    //         ListNode currTemp = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = currTemp;
    //     }
    //     return prev;
    // }
    //  使用一趟遍历，双指针法
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode list = new ListNode(-1);
        list.next = head;
        ListNode fastNode = list;
        ListNode slowNode = list;
        for (int i = 0; i< n; i++) {
            fastNode = fastNode.next;
        }
        while (fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }
        slowNode.next = slowNode.next.next;
        return list.next;
    }
}
// @lc code=end

