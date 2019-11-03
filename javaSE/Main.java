// public class Main {
//     public static void main(String[] args) {
//         String s = "Test string";
//         int n1 = s.indexOf('t');
//         int n2 = s.indexOf("st");
//         int n3 = s.indexOf("st", 4);
//         System.out.println(n1);
//         System.out.println(n2);
//         System.out.println(n3);
//     }
// }
/**
public class Main {
    public static void main(String[] args) {
        Person p = new Person("小明", 12);
        Student s = new Student("小红", 20, 99);
        //向上转型
        Person pstu = s;
        System.out.println(pstu.getName());
        //向下转型，先做判断
        Person ptod = new Student("小李", 12, 45);
        if(ptod instanceof Student){
            Student snow = (Student) ptod;
            System.out.println(snow.getScore());
        }
        
        // TODO: 定义PrimaryStudent，从Student继承，新增grade字段:
        Student ps = new PrimaryStudent("小军", 9, 100, 5);
        System.out.println(ps.getScore());
        AbstractSon son = new AbstractSon();
        son.run();
    }
}

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

class Student extends Person {
    protected int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() { return score; }
}

class PrimaryStudent extends Student{
    protected int grade;
    
    public PrimaryStudent(String name, int age, int score, int grade){
        super(name, age, score);
        this.grade = grade;
    }
}

abstract class AbstractParent{
    public abstract void run();
}

class AbstractSon extends AbstractParent{
    public AbstractSon(){};
    @Override
    public void run(){
        System.out.println("hello");
    }
}
 */
/**
public class Main {
    public static void main(String[] args) {
        Person ming = new Person("Xiao Ming", 12);
        Person hong = new Person("Xiao Hong", 15);
        ming.number = 88;
        System.out.println(hong.number);
        hong.number = 99;
        System.out.println(ming.number);
    }
}

class Person {
    public String name;
    public int age;

    public static int number;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("hao");
        Person p1 = new Person();
        System.out.println(Person.getCount());
    }
}

class Person {
    protected String name;
    protected static int count = 0;
    public Person(){
        ++count;
    }
    public Person(String name){
        this.name = name;
        ++count;
    }
    public void setName(String name){
        this.name = name;
    }
    public static int getCount(){
        return count;
    }
}