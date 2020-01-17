import java.util.Random;

/**
 * @author hsqzs
 * date 2020/1/10 16:04
 */
public class QuickSort {
    public static void main(String[] args) {
        int [] list = {8,2,7,3,11,3,4,34,2,3,2,78,6,5,4,43,3,3,232,3,23,4,5454,5,6};
        quickSort(list);
        printList(list);
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
        //使用随机基数
        int randomNum = (int) ( start + Math.random() * (end - start + 1));
        int t = list[end];
        list[end] = list[randomNum];
        list[randomNum] = t;
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
    private static void printList(int[] list) {
        int count = 0;
        for (int i : list) {
            ++count;
            if (count != list.length) {
                System.out.print(i + ",");
            }
            else {
                System.out.print(i);
            }
        }
    }
}
