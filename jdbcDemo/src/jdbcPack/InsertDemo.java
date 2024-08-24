package jdbcPack;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDemo {

    public static void main(String[] args) throws Exception {
        System.out.println("jdbc");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/InsertDemo","root","Example@2023");
//here InsertDemo is database name, root is username and password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from emp");
            while(rs.next())
                System.out.println(rs.getInt("sno")+" "+rs.getString("first_name")+"  "+rs.getString("last_name"));

                        con.close();
        }catch(Exception e){ System.out.println(e);}
    }

}

