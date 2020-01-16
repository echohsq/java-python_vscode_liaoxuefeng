public class MergeSortMain {
    public static void main(String[] args) {
        int [] list = {8,2,7,5,10};
        mergeSort(list);
        for (int i : list) {
            if (i != list[list.length - 1]) {
                System.out.print(i + ",");
            }
            else {
                System.out.println(i);
            }
        }
    }
    public static void mergeSort (int [] list) {
        int start = 0;
        int end = list.length - 1;
        sort(list, start, end);
    }
    /**
     *     递归排序，直到左边指针大于等于右边指针时开始合并。
     */
    public static void sort(int [] list, int start, int end) {
        if (start >= end){
            return ;
        }
        int mid = start + ((end - start) >> 1);
        sort(list, start, mid);
        sort(list, mid + 1, end);
        merge(list, start, mid, end);
        //mergeBySentry(list, start, mid, end);
    }
    // 合并算法
    public static void merge(int [] list, int s, int m, int e) {
        int [] temp = new int [e - s + 1];
        int s1 = s;
        int s2 = m + 1;
        int i = 0;
        while (s1 <= m && s2 <= e) {
            temp[i++] = list[s1] < list[s2] ? list[s1++] : list[s2++];
        }
        while (s1 <= m){
            temp[i++] = list[s1++];
        }
        while (s2 <= e){
            temp[i++] = list[s2++];
        }
        // 把最终的排序的结果复制给原数组
        for(i = 0; i < temp.length; i++) {
            list[s + i] = temp[i];
        }
    }
    /**
     * 使用哨兵减少边界判断条件
     */
    public static void mergeBySentry(int [] list, int start, int mid, int end) {
        int i = 0, j = 0, k = 0;
        int leftSize = mid - start + 1;
        int rightSize = end - mid;
        int[] tempLeft = new int [leftSize + 1];
        int[] tempRight = new int[rightSize + 1];
        for (; i < leftSize; i++) {
            tempLeft[i] = list[start + i];
        }
        for (; j < rightSize; j++) {
            tempRight[j] = list[mid + j + 1];
        }
        int maxLeft = Integer.MAX_VALUE;
        int maxRight = Integer.MAX_VALUE;
        tempLeft[leftSize] = maxLeft;
        tempRight[rightSize] = maxRight;
        for(k=start,i=0,j=0; k <= end; k++) {
            if(tempLeft[i] < tempRight[j]) {
                list[k] = tempLeft[i];
                i++;
            }
            else {
                list[k] = tempRight[j];
                j++;
            }
        }
    }
}