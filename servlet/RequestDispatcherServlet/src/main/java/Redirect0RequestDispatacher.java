import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/submitForm")
public class Redirect0RequestDispatacher extends HttpServlet {


        @Override
        protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String myemail = (String) req.getParameter("email");
            String mypassword = (String) req.getParameter("password");


            PrintWriter out= resp.getWriter();
            if (myemail.equals("ahmedkhan@gmail") && mypassword.equals("ahmed@123")) {
               RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
                  rd.forward(req,resp);
            } else {
                out.println("inavalid user ");
                RequestDispatcher rd = req.getRequestDispatcher("/index.html");
                rd.forward(req,resp);
            }


        }}