import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

class ClassFirst extends GenericServlet
//class ClassFirst extends HttpServlet
//class FirstServlet extends GenericServlet
{



    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
//    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        try
        {
            res.setContentType("text/HTML");
            PrintWriter pw = res.getWriter();
            pw.println("<html><body bgcolor=green text=yellow><h1>");
            pw.println("Welcome to MyServlets.FirstServlet response");
            pw.println("</h1></body></html>");
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }
}