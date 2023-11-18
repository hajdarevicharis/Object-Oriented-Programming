package Week3.Lab;

import javax.xml.crypto.Data;
import java.sql.*;

public class DataBaseConnect {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/my_database";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "haki2003";

    private Connection connection = null;

    public DataBaseConnect() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getAllUsers() throws SQLException {
        PreparedStatement statement = this.
                connection.
                prepareStatement("select * from user NATURAL JOIN userdetails;");
        ResultSet rs = statement.executeQuery();

        while(rs.next()) {
            System.out.println(rs.getString("username"));
            System.out.println(rs.getString("full_name"));
        }
    }

    public void getTaskByID(int id) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("select * from tasks where id = ?");
        statement.setInt(1,id);
        ResultSet rs = statement.executeQuery();

        while(rs.next()) {
            System.out.println(rs.getString("task_description") + " - " + rs.getString("task_status"));
        }
}
}

