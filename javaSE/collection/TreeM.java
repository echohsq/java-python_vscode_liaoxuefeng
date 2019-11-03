import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 有序key sortedMap (interface)-> TreeMap (class)
 */
public class TreeM {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("banana", 12);
        map.put("orange", 13);
        map.put("apple", 65);
        for (String name : map.keySet()){
            int value = map.get(name);
            System.out.println(name + " = " + value);
        }
        // 对于自己指定的类型，要放入TreeMap一定要实习comparator接口
        Map<Person, Integer> myMap = new TreeMap<>(new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name);
            }
        });
        myMap.put(new Person("Tom"), 1);
        myMap.put(new Person("Bob"), 2);
        myMap.put(new Person("Lily"), 3);
        for (Person key : myMap.keySet()) {
            System.out.println(key);
        }
        // {Person: Bob}, {Person: Lily}, {Person: Tom}
        System.out.println(myMap.get(new Person("Bob"))); // 2
    }
}
class Person {
    public String name;
    Person(String name) {
        this.name = name;
    }
    public String toString() {
        return "{Person: " + name + "}";
    }
}