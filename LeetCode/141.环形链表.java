
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    // 哈希表存储节点法
//     public boolean hasCycle1(ListNode head) {
//         Set<ListNode> list = new HashSet<>();
//         while(head != null){
//             if (list.contains(head)){
//                 return true;
//             }
//             else{
//                 list.add(head);
//                 head = head.next;
//             }
//         }
//     return false;
// }
// 快慢节点法
public boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) {
        return false;
    }
    ListNode fastNode = head.next;
    ListNode slowNode = head;
    while (fastNode != slowNode) {
        if (fastNode == null || fastNode.next == null) {
            return false;
        }
        fastNode = fastNode.next.next;
        slowNode = slowNode.next;
    }
    return true;
}
}
// @lc code=end

