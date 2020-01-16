/*
 * @lc app=leetcode.cn id=215 lang=java
 *
 * [215] 数组中的第K个最大元素
 */

// @lc code=start
class Solution {
    int [] nums;
    int k;
    public int findKthLargest(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
        int start = 0;
        int end = nums.length - 1;
        int KthLargest = find(start, end);
        return KthLargest;
    }
    private int find(int start, int end) {
        if (start >= end) {
            return nums[start];
        }
        int p = partition(start, end);
        if (k == p+1) {
            return nums[p];
        }else if ( k > p+1) {
            return find(p+1, end);
        }else {
            return find(start, p - 1);
        }
    }
    private  int partition(int start, int end) {
        int pivot = nums[end];
        int i = start;
        int j = start;
        for (; j < end; j++) {
            if (nums[j] > pivot) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        int temp = nums[i];
        nums[i] = pivot;
        nums[j] = temp;
        return i;
    }
}
// @lc code=end

