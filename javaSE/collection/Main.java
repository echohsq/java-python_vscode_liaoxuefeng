import java.util.Iterator;
import java.util.List;
/**
 * @author hsq
 * java 标准库自带的java.util包提供了集合类： collection 是所有集合类的根接口
 * 1. list 一种有序列表的集合，例如，按索引排列
 * 2. Set 一种保证没有重复元素的集合
 * 3. Map 一种通过键值对（key - value）查找的映射表集合
 */
public class Main {
    /**
     * list: ArrayList(数组)
     * 1. add()
     * 2. remove()
     * 3. size()
     * 4. get()
     * list: LinkedList(链表)
     */
    public static void main(String[] args) {
        // 创建list of()方法
        List<Integer> list1 = List.of(1,2,3);
        // 始终使用迭代器来访问list
        for(Iterator<Integer> it = list1.iterator(); it.hasNext();){
            int s = it.next();
            System.out.println(s);
        }
        // list和Array转换 jdk11以前的版本使用Arrays.asList(T...)
        List<Integer> list2 = List.of(4,5,6);
        Integer[] arr = list2.toArray(new Integer[list2.size]);
        Integer[] array = list2.toArray(Integer[]::new);
        for(Integer i : arr){
            System.out.println(i);
        }
    }
}