package crud;

import java.sql.*;

public class FetchData {


        public static void main(String[] args) throws Exception {
            // 1. loading driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2.creating connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "Example@2023");
            // 3. create statement object
            PreparedStatement ps = con.prepareStatement("SELECT * FROM student");

            // Retrive

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                System.out.println(rs.getInt(1)+" "+rs.getString("first_name")+" "+rs.getString("last_name"));
            }
            con.close();
        }
    }

