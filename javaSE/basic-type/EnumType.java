/**
 * java 枚举类型的使用
 * @author hao
 */
public class EnumType {
    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
        switch (day) {
            case MON:
            case TUE:
            case WED:
            case THU:
            case FRI:
                System.out.println("Today is " + day + ". week at office!");
                break;
            case SAT:
            case SUN:
                System.out.println("Today is " + day + ". week at home!");
                break;
            default:
                throw new RuntimeException("cannot process" + day);
        }
        // enum提供的name（）方法，提供枚举类的名字。
        System.out.println(day.name());
        // enum提供的次序，但是不要使用，要判断顺序使用自己写的构造方法。
        System.out.println(day.ordinal());
        System.out.println(day.toString());
        // 自己提供的构造函数
        System.out.println(day.dayValue);
    }
    
    enum Weekday {
        MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"), SUN(0, "星期天");
        public final int dayValue;
        public final String chinese;
        private Weekday(int dayValue, String chinese){
            this.dayValue = dayValue;
            this.chinese = chinese;
        } 
        @Override
        public String toString(){
            return this.chinese;
        }
    }
}