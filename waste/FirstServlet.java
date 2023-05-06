
import java.io.*;
import jakarta.servlet.*;

class FirstServlet extends GenericServlet
{
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
    {
        try
        {
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