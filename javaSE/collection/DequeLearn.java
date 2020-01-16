import java.util.Deque;
import java.util.LinkedList;

/**
 * 双端队列
 * @author hao
 */
public class DequeLearn {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offerLast("hao");
        deque.offerLast("sheng");
        deque.offerLast("qiang");
        deque.offerFirst("hello");
        while(deque.peekFirst() != null){
            System.out.println(deque.pollFirst());
        }
    }
}