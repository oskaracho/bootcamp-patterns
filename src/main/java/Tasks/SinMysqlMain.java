package Tasks;
public class SinMysqlMain {
    public static void main(String[]arg){
        MySqlDBClient mySqlDBClient = MySqlDBClient.getConnection();
        System.out.println(mySqlDBClient.getData());
        MySqlDBClient mySqlDBClient2 = MySqlDBClient.getConnection();
        System.out.println(mySqlDBClient2.getData());
        MySqlDBClient mySqlDBClient3 = MySqlDBClient.getConnection();
        System.out.println(mySqlDBClient3.getData());


    }
}
