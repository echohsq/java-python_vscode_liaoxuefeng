import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueLearn {
    /**
     * 
     * @param args 
     * 队列：Queue
     * 方法：
     * 1. int size() 获取队列长度
     * 2. boolean add(E) / boolean offer(E) 添加元素到队尾
     * 3. E remove() / poll() 获取队首元素并从队列中删除
     * 4. E element() / E peek() 获取队首元素但并不从队列中删除
     */
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("apple");
        q.offer("banana");
        q.offer("orange");
        // 从队列取出元素:
        System.out.println(q.poll()); 
        System.out.println(q.poll());
        System.out.println(q.poll()); 
        System.out.println(q.poll()); 
        // 优先队列 实现Comparable接口，实现自定义比较方法
        Queue<String> q1 = new PriorityQueue<>();
        System.out.println("-----------");
        // 添加3个元素到队列:
        q1.offer("banana");
        q1.offer("pear");
        q1.offer("apple");
        // 从队列取出元素:
        System.out.println(q1.poll()); 
        System.out.println(q1.poll());
        System.out.println(q1.poll()); 
    }
}