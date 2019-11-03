import java.util.*;
public class TemplateMain {
    public static void main(String[] args) {
        Pair<Integer> pairInt = new Pair(123, 456);
        int n = add(pairInt);
        System.out.println(n);
        List<Person> list = List.of(
            new Person("Xiao", "Ming", 18),
            new Person("Xiao", "Hong", 25),
            new Person("Bob", "Smith", 20)
        );
        boolean exist = list.contains(new Person("Bob", "Smith", 20));
        System.out.println(exist ? "测试成功!" : "测试失败!");
    }
    // ? extends Number 继承通配符
    // 作用： 1. 保证通配符的继承
    //       2. 限定能够使用的泛型，高于Number的类型不能指派 
    static int add(Pair<? extends Number> p){
        // 方法参数签名setFirst(? extends Number)无法传递任何Number类型给setFirst(? extends Number)。
        // p.setFirst(Integer.valueOf(100));
        int value = p.getFirst().intValue() + p.getLast().intValue();
        return value;
    }
    /**
    <? extends T>允许调用读方法T get()获取T的引用，但不允许调用写方法set(T)传入T的引用（传入null除外）；
    <? super T>允许调用写方法set(T)传入T的引用，但不允许调用读方法T get()获取T的引用（获取Object除外）。
    何时使用extends，何时使用super？为了便于记忆，我们可以用PECS原则：Producer Extends Consumer Super。 
    */
}
class Pair<T> {
    private T firstName;
    private T lastName;
    public Pair(T firstName, T lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public T getFirst() {
        return firstName;
    }
    public T getLast() {
        return lastName;
    }
    public void setFirst(T first) {
        this.firstName = first;
    }
    public void setLast(T last) {
        this.lastName = last;
    }
}

class Person {
    String firstName;
    String lastName;
    int age;
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
   @Override
   public boolean equals(Object o){
       if(o instanceof Person){
           Person p = (Person) o;
           return Objects.equals(this.firstName, p.firstName) && Objects.equals(this.lastName, p.lastName) && this.age == p.age;
       }
       return false;
  }
}
