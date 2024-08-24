package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertData {

    public static void main(String[] args) throws Exception {


        int id = 105;
        String first_name = "ravi";
        String last_name = "reddy";

        // 1. loading driver
        Class.forName("com.mysql.jdbc.Driver");
        // 2.creating connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "Example@2023");
        // 3. create statement object
        PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");

        ps.setInt(1, id);
        ps.setString(2, first_name);
        ps.setString(3, last_name);

        int count = ps.executeUpdate();
        if (count > 0) {
            System.out.println("successfully inserted");
        } else {
            System.out.println("not successfully ");
        }
        con.close();
    }
}
