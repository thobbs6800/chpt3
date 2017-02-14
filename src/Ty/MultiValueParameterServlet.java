package Ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MultiValueParameterServlet
 */
@WebServlet(name ="multiValueParameterServlet",
			urlPatterns ={"/checkboxes"}
		)
public class MultiValueParameterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MultiValueParameterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter writer = response.getWriter();
		
		writer.append("<!DOCTYPE html>\r\n");
		writer.append("<html>\r\n");
		writer.append("     <head>\r\n");
		writer.append("     <title>Hello User App</title>\r\n");
		writer.append("  </head>\r\n");
		writer.append("    <body>\r\n");
		writer.append("   <form action =\"checkboxes\" method =\"POST\">\r\n ");
		writer.append("Select the candy you like to eat: <br/>\r\n    ");
		writer.append("<input type = \"checkbox\" name=\"fruit\" value =\"Banana\"/>\r\n    ");
		writer.append(" Banana<br/>\r\n   ");
		writer.append("<input type = \"checkbox\" name=\"fruit\" value =\"Apple\"/>\r\n    ");
		writer.append(" Apple<br/>\r\n   ");
		writer.append("<input type = \"checkbox\" name=\"fruit\" value =\"Orange\"/>\r\n    ");
		writer.append(" Orange<br/>\r\n   ");
		writer.append("<input type = \"checkbox\" name=\"fruit\" value =\"Strawberry\"/>\r\n    ");
		writer.append(" Strawberry<br/>\r\n   ");
		writer.append("<input type = \"checkbox\" name=\"fruit\" value =\"Pear\"/>\r\n    ");
		writer.append(" Pear<br/>\r\n   ");
		writer.append("<input type=\"submit\" value=\"Submit\"/>\r\n");
		writer.append("</form>\r\n");
		writer.append("</body>\r\n");
		writer.append("</hmtl>\r\n");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] fruits = request.getParameterValues("fruit");
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter writer = response.getWriter();
		
		writer.append("<!DOCTYPE html>\r\n");
		writer.append("<html>\r\n");
		writer.append("     <head>\r\n");
		writer.append("     <title>Hello User App</title>\r\n");
		writer.append("  </head>\r\n");
		writer.append("    <body>\r\n");
		writer.append("<h2>Your Selection</h2>\r\n");
		
		if(fruits == null)
			writer.append("You did not select any fruits.\r\n");
		else
		{
			writer.append("        <ul>\r\n");
			for(String fruit : fruits)
			{
				writer.append("      <li>").append(fruit).append("</li>\r\n");
			}
			writer.append("           </ul>\r\n");
			
		}
		writer.append("  </body>\r\n");
		writer.append("</hmtl>\r\n");
		
	}

}
