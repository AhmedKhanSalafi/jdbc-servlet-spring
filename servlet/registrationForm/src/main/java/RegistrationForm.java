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
@WebServlet("/registrationForm")
public class RegistrationForm extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String myname = req.getParameter("name");
        String myemail = req.getParameter("email");
        String mypass = req.getParameter("password");
        String mygender = req.getParameter("gender");
        String mycity = req.getParameter("city");


        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2.creating connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindemo", "root", "Example@2023");
            // 3. create statement object
            PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");

            ps.setString(1, myname);
            ps.setString(2, myemail);
            ps.setString(3, mypass);
            ps.setString(4, mygender);
            ps.setString(5, mycity);


           int count = ps.executeUpdate();
            // RequestDispatcher rd;
            if (count>0) {

               // HttpSession session = req.getSession();
              //  session.setAttribute("session_name", rs.getString("name"));
                out.print("<h3 style='color:green'>Rgistration successfully </h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
                rd.include(req, resp);
            } else {

                out.print("<h3 style='color:red'>not register due some error </h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
                rd.include(req, resp);
            }

        } catch (Exception e) {

            e.printStackTrace();
            out.print("<h3 style='color:red'>" + e.getMessage() + " </h3>");
            RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
            rd.include(req, resp);
        }

    }
}


