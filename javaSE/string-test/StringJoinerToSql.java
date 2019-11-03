import java.util.StringJoiner;

public class StringJoinerToSql{
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String select = buildSelectSql(table, fields);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");
    }
    static String buildSelectSql(String table, String[] fields){
        var sql = new StringJoiner(", ", "SELECT ", " FROM " + table);
        for(String field : fields){
            sql.add(field);
        }
        return sql.toString();
    }
}