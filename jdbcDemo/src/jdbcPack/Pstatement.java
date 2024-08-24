package jdbcPack;

import java.sql.*;


public  class Pstatement{

        public static void main(String[] args) throws Exception {
            // 1. loading driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2.creating connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelman", "root", "Example@2023");
            // 3. create statement object
            PreparedStatement pstmt = con.prepareStatement("insert into products values (?,?)");
            pstmt.setString(7, "cola");
            // create
            PreparedStatement stmt = null;
            boolean execute = stmt.execute("create table emp1(id int,name varchar(20))");
            // insert
           int rows = stmt.executeUpdate("INSERT INTO emp values(102,'xy')");
            // System.out.println(rows+" rows inserted to table");
            // Retrive
//				ResultSet rs = stmt.executeQuery("SELECT * FROM products");
//				 while (rs.next()) {
//
//				 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
//				 }
//				 con.close();
            boolean b = pstmt.execute("select*from products where product_id = 4");
            ResultSet set = pstmt.getResultSet();
            while (set.next()) {
                if (b==true) {
                    System.out.println(set.getString(1)+" "+set.getString(2)+" "+set.getString(3));
                }

                else {
                    System.out.println(pstmt);
                }

                con.close();

            }
        }
    }




