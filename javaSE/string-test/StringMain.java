import java.util.Arrays;
import java.util.*;
public class StringMain{
    public static void main(String[] args) {
        String name = "hao";
        //注意到contains()方法的参数是CharSequence而不是String，因为CharSequence是String的父类。
        System.out.println(name.contains("h"));
        int[] scores = new int[] {91, 65, 45, 90};
        Score s = new Score(scores);
        s.printScores();
        scores[2] = 99;
        s.printScores();
        // 拼接字符串
        String[] names = {"Bob", "Alice", "Grace"};
        //StringJoiner()第一个参数为插入符，第二个和第三个参数为拼接串的开头和结尾。
        var sj = new StringJoiner(", ", "Hello ", "!");
        for (String n : names) {
            sj.add(n);
        }
        System.out.println(sj.toString());
    }
}
class Score{
    private int[] scores;
    public Score(int[] scores){
        //使用clone（），防止外部代码改变内部int数组
        // this.scores = scores.clone();
        this.scores = scores;
    }
    public void printScores(){
        System.out.println(Arrays.toString(scores));
    }
}