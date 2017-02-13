package Ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(name ="HelloServlet",
			urlPatterns ={"/greeting", "/salutation", "/wassup"},
			loadOnStartup = 1
		)
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	private static final String DEFAULT_USER = "Guest";
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		if(user == null)
			user = HelloServlet.DEFAULT_USER;
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter writer = response.getWriter();
		writer.append("<!DOCTYPE html>\r\n");
			writer.append("<html>\r\n");
			writer.append("     <head>\r\n");
			writer.append("     <title>Hello User App</title>\r\n");
			writer.append("  </head>\r\n");
			writer.append("    <body>\r\n");
			writer.append( "     Hello, ").append(user).append("!<br/><br/>\r\n") ;
			writer.append("     <form action =\"greeting\" method =\"POST\">\r\n");
			writer.append("                    Enter your name: <br/>\r\n");
			writer.append("                   <input type = \"text\" name=\"user\"/>\r\n");
			writer.append("                   <input type =\"submit\" value =\"Submit\"/>\r\n");
			writer.append("     </form>\r\n");
			writer.append("     </body>\r\n");
			writer.append("    </html>\r\n");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}
	@Override
	public void init () throws ServletException
	{
		System.out.println("Servlet " + this.getServletName() + " has started!");
	}
	
	@Override
	public void destroy(){
		System.out.println("Servlet " + this.getServletName() + " has stopped!");
	}

}
