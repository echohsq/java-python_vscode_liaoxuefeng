public class Test{

    public static void main(String[] args) {
        Test test = new Test();
        int i = 0;
        //java 传参是值传递，同时i为基本类型变量，局部变量不会影响全局变量。
        test.fermin(i);
        i=i++;
        System.out.println(i);
    }
    void fermin(int i){
        i++;
    }
}