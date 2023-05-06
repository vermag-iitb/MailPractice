import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(description = "This is my first servlet in Eclipse IDE as a JAVA Web Project", urlPatterns = { "/demo" })
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try
        {
            response.setContentType("text/HTML");
            PrintWriter pw = response.getWriter();
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