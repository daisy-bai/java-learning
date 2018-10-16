package chapter5;

import java.sql.*;

/**
 * 使用JDBC连接数据库
 */
public class ConnectionMysql {

    //JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/l2r?characterEncoding=utf8&useSSL=false";

    //数据库的用户名与密码，需要根据自己的设置
    static final String USER = "l2r";
    static final String PASS = "123456";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            //注册JDBC驱动
            Class.forName(JDBC_DRIVER);

            //打开连接
            System.out.println("连接数据库。。。");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql = "SELECT id,name,url FROM websites";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("id    name     url");
            //展开结果集数据库
            while (rs.next()) {
                //通过字段检索
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");

                //输出数据
                System.out.print(id);
                System.out.print("     ");
                System.out.print(name);
                System.out.print("     ");
                System.out.print(url);
                System.out.print("     ");
                System.out.print("\n");
            }

            //完成后关闭
            rs.close();
            ;
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException i) {
            i.printStackTrace();
        } finally {
            //关闭资源
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException e1) {

            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        System.out.println("GoodBye!");

        //获取日期和时间格式
        //为了和下面 SQL 的日期做对比所以直接写明是 java.util.Date类
        //我们也可以引入 java.util.Date包，然后声明为 Date 类
        java.util.Date javaDate = new java.util.Date();
        long javaTime = javaDate.getTime();
        System.out.println("The Java Date is:" + javaDate.toString());

        //获取 SQL 的日期
        java.sql.Date sqlDate = new java.sql.Date(javaTime);
        System.out.println("The SQL DATE is: " + sqlDate.toString());

        //获取 SQL 的时间
        java.sql.Time sqlTime = new java.sql.Time(javaTime);
        System.out.println("The SQL TIME is: " + sqlTime.toString());
        //获取 SQL 的时间戳
        java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(javaTime);
        System.out.println("The SQL TIMESTAMP is: " + sqlTimestamp.toString());


    }

}
