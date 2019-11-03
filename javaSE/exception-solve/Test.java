import java.security.SecureRandom;

public class Test {
    public static void main(String[] args) {
        SecureRandom num = new SecureRandom();
        System.out.println(num.nextInt(10));
        String a = "12";
        String b = "3";
        // String b = "b3";
        int c = stringToInt(a);
        int d = stringToInt(b);
        System.out.println(c * d);
        try {
            System.out.println(tax(1000, 0.1));
            System.out.println(tax(1000, -0.1));
            System.out.println(tax(-2000, 0.1));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        
    }
    static int stringToInt(String n){
        try {
            int num = Integer.parseInt(n);
            return num;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(e+"-------字符串非全为数字");
            return 0;
        }
    }
    static double tax(double salary, double rate){
        if(salary < 0 || rate < 0){
            throw new IllegalArgumentException();
        }
        return salary * rate;
    }
}