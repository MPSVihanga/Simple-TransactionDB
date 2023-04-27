import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private final static String url = "jdbc:mysql://localhost:3306/TransactionDB ?useSSL=false";
    private final static String username = "root";
    private final static String password = "vihanga123";
    private final static String Driver ="com.mysql.cj.jdbc.Driver";

    private static DBConnection dbConnection;
    private Connection connection;

    private void DbbConnection() throws ClassNotFoundException, SQLException {
        Class.forName(Driver);
        connection= DriverManager.getConnection(url, username, password);
    }

    public synchronized static DBConnection getInstance() throws SQLException, ClassNotFoundException {

        return dbConnection==null? dbConnection=new DBConnection():dbConnection;
    }

    public Connection getConnection(){
        return connection;
    }
}
