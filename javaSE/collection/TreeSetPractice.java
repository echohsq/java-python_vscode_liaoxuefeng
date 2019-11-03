import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        List<Message> received = List.of(
            new Message(1, "Hello!"),
            new Message(2, "发工资了吗？"),
            new Message(2, "发工资了吗？"),
            new Message(3, "去哪吃饭？"),
            new Message(3, "去哪吃饭？"),
            new Message(4, "Bye")
        );
        List<Message> displayMessages = process(received);
        for (Message message : displayMessages) {
            System.out.println(message.text);
        }
    }

    static List<Message> process(List<Message> receive) {
        // 没有实现Comparator接口的，一定要指定比较方法来设置TreeSet和TreeMap
        Set<Message> rec = new TreeSet<>(new Comparator<Message>() {
            public int compare(Message m1, Message m2) {
                return Integer.compare(m1.sequence, m2.sequence);
            }
        });
        for (Message m : receive){
            rec.add(m);
        }
        List<Message> recList = new ArrayList<>(rec);
        return recList;
    }
}

class Message {
    public final int sequence;
    public final String text;
    public Message(int sequence, String text) {
        this.sequence = sequence;
        this.text = text;
    }
}