/**
 * 二分查找
 * @author hsqzs
 * date 2020/1/17 16:43
 */
public class Bserach {
    public static void main(String[] args) {
        int [] nums = {3,4,5,9,10,13,15,21,54,68};
        int len = nums.length;
        // value 位于第五位
        int value = 10;
        System.out.println(bSerach(nums, len, value));
    }
    private static int bSerach(int[] list, int n, int value) {
        int start = 0;
        int end = n - 1;
        //while (start <= end) {
        //    int mid = start + ((end - start) >> 1);
        //    if (list[mid] == value) {
        //        return mid + 1;
        //    }else if (list[mid] > value) {
        //        end = mid - 1;
        //    }else {
        //        start = mid + 1;
        //    }
        //}
        //return -1;
        return bSerachInternally(list, start, end, value);
    }
    //递归
    private static int bSerachInternally(int[] a, int low, int high, int value) {
        if (low > high) {
            return -1;
        }
        int mid = low + ((high - low) >> 1);
        if (value > a[mid]) {
            return  bSerachInternally(a, mid + 1, high, value);
        } else if (value < a[mid]) {
            return bSerachInternally(a, low, mid - 1, value);
        }else {
            return mid + 1;
        }
    }
}
