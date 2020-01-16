/**
 * @author hsqzs
 * date 2020/1/15 11:06
 * 计数排序
 */
public class CountingSort {
    public static void main(String[] args) {
        int [] list = {8,2,7,3,10,1,0,0,9,6,6,7,6,3,2,8,8,8,7,9,10,8,8,7,5,4,3,3,5,4,4};
        //int [] list = {8,2,7,3,10,1,0};
        countingSort(list);
        printList(list);
    }
    private static void countingSort(int[] list) {
        if (list.length <= 1) {
            return;
        }
        //计算需要多少桶来存放数据
        int max = list[0];
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        int[] countList = new int[max + 1];
        for (int i = 0; i <= max; ++i) {
            countList[i] = 0;
        }
        //计算每个元素的个数，放入countList中
        for (int i = 0; i < list.length; ++i) {
            countList[list[i]]++;
        }
        // 将数据进行累加
        for (int i = 1; i < max + 1; ++i) {
            countList[i] = countList[i - 1] + countList[i];
        }
        //printList(countList);
        //创建临时表temp存储排序后的数组
        int [] temp = new int[list.length];
        for (int i = list.length - 1; i >= 0; --i) {
            int index = countList[list[i]] - 1;
            temp[index] = list[i];
            // 当前数据已排好，所以当前值减一
            countList[list[i]]--;
        }
        // 数组拷贝
        System.arraycopy(temp, 0, list, 0, temp.length);
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
