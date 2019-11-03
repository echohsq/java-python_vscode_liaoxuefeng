public class MuitlException {
    public static void main(String[] args) {
        // JVM捕获异常后，会从上到下匹配catch语句，多个catch语句只有一个能被执行。
        try {
                process1();
                process2();
                process3();
            } catch (IOException e) {
                System.out.println(e);
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        // 无论是否发生异常，都会执行finally下的代码。
        //finally语句不是必须的，可写可不写；finally总是最后执行。
        try {
                process1();
                process2();
                process3();
            } catch (UnsupportedEncodingException e) {
                System.out.println("Bad encoding");
            } catch (IOException e) {
                System.out.println("IO error");
            } finally {
                System.out.println("END");
            }
        // 捕获多种异常，对于处理方式相同的异常，使用 | 来将两个异常合并。
        try {
                process1();
                process2();
                process3();
            } catch (IOException | NumberFormatException e) { // IOException或NumberFormatException
                System.out.println("Bad input");
            } catch (Exception e) {
                System.out.println("Unknown error");
            }
        // 创建完整的异常栈，保持最原始的异常错误
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 创建完整的异常栈，保持最原始的异常错误
    static void method1(){
        try {
            method2();
        } catch (NullPointerException e) {
            // 加上下层返回的NullPointerException实例 e
            throw IllegalArgumentException(e);
        }
    }
    static void method2(){
        throw new NullPointerException();
    }
}