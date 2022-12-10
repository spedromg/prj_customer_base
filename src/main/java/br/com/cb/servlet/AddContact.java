package br.com.cb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import br.com.cb.factory.ConnectionFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/addcontact")
public class AddContact extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		try (Connection conn = new ConnectionFactory().getConnection()){
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>" + conn + "</h1>");
			out.println("</body>");
			out.println("</html>");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
