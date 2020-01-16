public class BubbleSort {
    private static void sort(int [] list, int n) {
        if(n <= 1) return ;
        boolean flag = false;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n-i-1; ++j) {
                if (list[j] > list[j +1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) break; 
        }
    }
    private static void insertSort(int [] list, int n){
        if (n <= 1) return ;
        for (int i = 1; i < n; ++i) {
            int value = list[i];
            int j = i -1;
            for (; j >= 0; --j) {
                if (list[j] < value){
                    list[j +1] = list[j];
                }else {
                    break;
                }
            }
            list[j +1] = value;
        }
    }
    public static void main(String[] args) {
        int [] list = {8,1,7,6,10};
        BubbleSort.insertSort(list, 5);
        for (int i : list) {
            System.out.println(i);
        }
        BubbleSort.sort(list, 5);
        for (int i : list) {
            System.out.println(i);
        }
    }
}