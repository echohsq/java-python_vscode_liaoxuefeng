public class MergeSortMain {
    public static void main(String[] args) {
        int [] list = {8,1,7,6,10};
        mergeSort(list);
        for (int i : list) {
            System.out.println(i);
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
    }
    // 合并算法
    public static void merge(int [] list, int l, int m, int e) {
        int [] temp = new int [list.length];
        int s1 = l;
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
    }
}