/**
 * @author hsqzs
 * date 2020/1/10 16:04
 */
public class QuickSort {
    public static void main(String[] args) {
        int [] list = {8,2,7,3,11};
        quickSort(list);
        for (int i : list) {
            if (i != list[list.length - 1]) {
                System.out.print(i + ",");
            }
            else {
                System.out.println(i);
            }
        }
    }

    /**
     * 快速排序
     */
    private static void quickSort(int [] list) {
        int s = 0;
        int e = list.length - 1;
        sort(list,s, e);
    }
    private static void sort(int [] list, int start, int end) {
        if (start >= end) {
            return ;
        }
        int p = partition(list, start, end);
        sort(list, start, p - 1);
        sort(list, p + 1, end);
    }

    private static int partition(int [] list, int start, int end) {
        int pivot = list[end];
        int i = start;
        int j = start;
        for (; j < end; j++) {
            if (list[j] < pivot) {
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
            }
        }
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
        return i;
    }
}
