public class Gouzao{
    private String name;
    private int age;
    // 空构造函数
    public Gouzao(){};
    // 构造函数
    public Gouzao(String name){
        this.name = name;
    }
    //一个构造方法，可以使用this调用另一个构造方法
    public Gouzao(int age){
        this("hao");
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public static void main(String[] args) {
        Gouzao person = new Gouzao(23);
        String name = person.getName();
        int age = person.getAge();
        System.out.println(name);
        System.out.println(age);
    }
}
