package Tasks;

    import java.sql.*;

public class MySqlDBClient {

    public static MySqlDBClient client = null;
    public static MySqlDBClient MysqlClient;

    private MySqlDBClient() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection MysqlClient = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/DBtest",
                    "root", "");
        } catch (Exception exception) {
            System.out.println(exception);
        }

    }
    public static MySqlDBClient getConnection()
    {
        if (client == null){
            System.out.println("Primera vez");
            client = new MySqlDBClient();
        }
        return client;
    }
    public long getData()
    {
        return 1;

    }
}
