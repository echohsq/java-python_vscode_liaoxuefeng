import java.util.*;

public class Test {
    public static void main(String[] args) {
        // 构造从start到end的序列：
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        // 洗牌算法suffle可以随机交换List中的元素位置:
        Collections.shuffle(list);
        // 随机删除List中的一个元素:
        int removed = list.remove((int) (Math.random() * list.size()));
        int found = findMissingNumber2(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }
    // 频繁调用Collection.contains()方法，复杂度为O(n),应该转为hashSet使复杂度为O(1)
    static int findMissingNumber1(int start, int end, List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        for (int i = start; i <= end; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
    }
    static int findMissingNumber2(int start, int end, List<Integer>list){
        int cnt = 1;
        for (int i = start; i <= end; i++){
            cnt = 1;
            for (Integer n : list){
                cnt ++;
                if (n == i){
                    break;
                }
            }
            if(cnt == 11){
                return i;
            }
        }
        return 0;
    }
}