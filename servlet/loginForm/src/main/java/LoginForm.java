import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/loginForm")
public class LoginForm extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String myemail= req.getParameter("email");
        String mypass= req.getParameter("password");
        PrintWriter out=resp.getWriter();



            try {

                Class.forName("com.mysql.jdbc.Driver");
                // 2.creating connection
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindemo", "root", "Example@2023");
                // 3. create statement object
                PreparedStatement ps = con.prepareStatement("SELECT * FROM from register where email=? and password=?");

                ps.setString(1,myemail);
                ps.setString(2,mypass);


                ResultSet rs = ps.executeQuery();
                // RequestDispatcher rd;
                if (rs.next()) {

                    HttpSession session = req.getSession();
                    session.setAttribute("session_name", rs.getString("name"));

                    RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
                    rd.include(req, resp);
                } else {
                    resp.setContentType("text/html");
                    out.print("<h3 style='color:red'>email id and password did not match</h3>");
                    RequestDispatcher   rd = req.getRequestDispatcher("/index.jsp");
                    rd.include(req, resp);
                }
            }catch (Exception e){

                e.printStackTrace();

                resp.setContentType("text/html");
                out.print("<h3 style='color:red'>"+e.getMessage()+" </h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
                rd.include(req, resp);
            }

        }
    }



