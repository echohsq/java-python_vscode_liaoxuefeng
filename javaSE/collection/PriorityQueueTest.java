import java.util.Comparator;

public class PriorityQueueTest {
    public static void main(String[] args) {
        Queue<User> q = new PriorityQueue<>(new UserComparator());
        // 添加3个元素到队列:
        q.offer(new User("Bob", "A1"));
        q.offer(new User("Alice", "A3"));
        q.offer(new User("crils", "A19"));
        q.offer(new User("dudde", "V2"));
        q.offer(new User("Boss", "V1"));
        System.out.println(q.poll()); // Boss/V1
        System.out.println(q.poll()); // Bob/A1
        System.out.println(q.poll()); // Alice/A2
        System.out.println(q.poll()); // null,因为队列为空
    }
}

class UserComparator implements Comparator<User> {
      public int compare(User u1, User u2){
          if(u1.number.charAt(0) == u2.number.charAt(0)){
              int u1Number = Integer.parseInt(u1.number.substring(1));
              int u2Number = Integer.parseInt(u2.number.substring(1));
              return Integer.compare(u1Number, u2Number);
          }
          if(u1.number.charAt(0) == 'V'){
              return -1;
          }else{
              return 1;
          }
      }
}

class User {
    public final String name;
    public final String number;

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return name + "/" + number;
    }
}