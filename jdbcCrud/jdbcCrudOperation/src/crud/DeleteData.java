package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteData {

    public static void main(String[] args) throws Exception {



        String first_name = "rosi";


        // 1. loading driver
        Class.forName("com.mysql.jdbc.Driver");
        // 2.creating connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "Example@2023");
        // 3. create statement object
        PreparedStatement ps = con.prepareStatement("DELETE FROM student WHERE first_name= ?");


        ps.setString(1, first_name);


        int count = ps.executeUpdate();
        if (count > 0) {
            System.out.println("successfully deleted");
        } else {
            System.out.println("not successful ");
        }
        con.close();
    }

}
