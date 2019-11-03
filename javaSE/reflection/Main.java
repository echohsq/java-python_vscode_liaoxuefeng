import java.lang.reflect.*;

public class Main{
    public static void main(String[] args) throws Exception{
        // 1.直接通过class的静态变量class来获取
        Class cls1 = String.class;
        String s = "hello";
        // 2.如果有一个实例变量，通过实例变量提供的getClass（）方法获取
        Class cls2 = s.getClass();
        // 3.通过一个class的一个完整类名，通过静态方法Class.forName()获取
        Class cls3 = Class.forName("java.lang.String");
        // 类实例在jvm内是唯一的，所以他们三个“==”
        System.out.println(cls1 == cls2); // true
        System.out.println(cls1 == cls3); // true
        System.out.println(cls2 == cls3); // true
        // 获取String的Class实例:
        Class cls = String.class;
        // 创建一个String实例:
        String str = (String) cls.getDeclaredConstructor().newInstance();
        System.out.println(str);
        /**
         * Field getField(name)：根据字段名获取某个public的field（包括父类）
         * Field getDeclaredField(name)：根据字段名获取当前类的某个field（不包括父类）
         * Field[] getFields()：获取所有public的field（包括父类）
         * Field[] getDeclaredFields()：获取当前类的所有field（不包括父类）
         */
        Student student = new Student(98, 6);
        Class stdClass = student.getClass();
        // 获取public字段"score":
        System.out.println(stdClass.getField("score"));
        // 获取继承的public字段"name":
        System.out.println(stdClass.getField("name"));
        // 获取private字段"grade":
        System.out.println(stdClass.getDeclaredField("grade"));
        Field grade = stdClass.getDeclaredField("grade");
        // 修改private属性
        grade.setAccessible(true);
        // 通过反射更改值
        grade.set(student, 5);
        System.out.println(student.getGrade());
        /**
         * 通过Class实例获取所有Method信息
         * Class... 指传入方法中的参数类型
         * Method getMethod(name, Class...) 获取某个public的Method(包括父类)
         * Method getDeclaredMethod(name, Class...) 获取当前类的某个Method （不包括父类）
         * Method[] getMethods() 获取所有public的Method (包括父类)
         * Method[] getDeclaredMethods() 获取当前类的所有Method (不包括父类)
         */
        System.out.println(stdClass.getMethod("getGrade"));
        // 修改private属性
        //Method.setAccessible(true);
        // 获取Integer.parseInt(String)方法，参数为String:
        Method m = Integer.class.getMethod("parseInt", String.class);
        // 调用该静态方法并获取结果:
        Integer n = (Integer) m.invoke(null, "12345");
        // 打印调用结果:
        System.out.println(n);
        // 调用构造方法 无参： newInstance() 有参： constructor -> newInstance()
        // 获取构造方法Integer(int):
        Constructor cons1 = Integer.class.getConstructor(int.class);
        // 调用构造方法:
        Integer n1 = (Integer) cons1.newInstance(123);
        System.out.println(n1);

        // 获取构造方法Integer(String)
        Constructor cons2 = Integer.class.getConstructor(String.class);
        Integer n2 = (Integer) cons2.newInstance("456");
        System.out.println(n2);
        // 获取继承关系
        Class stu = Student.class;
        // 获取父类
        Class p = stu.getSuperclass();
        System.out.println(p);
        // 获取interface -> getInterfaces()
        Class superInt = Integer.class.getSuperclass();
        Class[] is = superInt.getInterfaces();
        for (Class i : is){
            System.out.println(i);
        }
        // 判断一个实例是否是某个类型时，正常情况下，使用instanceof操作符
        // 两个Class实例，要判断一个向上转型是否成立，可以调用isAssignableFrom()
    }
}
class Student extends Person {
    public int score;
    private int grade;
    public Student(int score, int grade){
        this.score = score;
        this.grade = grade;
    }
    public int getGrade(){
        return grade;
    }
}

class Person {
    public String name;
}