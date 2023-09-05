import java.sql.*;
import java.sql.Statement;
import java.sql.DriverManager;
public class MYJDBC {
    public static void main(String[] args) {
        try
        {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc",
                    "root","12345");
            Statement statement= connection.createStatement();
            ResultSet resultSet= statement.executeQuery("select * from people");
            while (resultSet.next()){
                System.out.println(resultSet.getString("id"));
            }

        }catch (SQLException throwables){
            System.out.println(throwables);
        }

    }
}
