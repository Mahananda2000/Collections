package com.xworkz.king;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup=1, urlPatterns="/king")
public class King extends HttpServlet {
	
	public King() {
		System.out.println("creating King....");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running init..config");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet in king...");
		
		String name=req.getParameter("kingname");
		String region=req.getParameter("region");
		String noOfQueens=req.getParameter("noofqueens");
		String dob=req.getParameter("dob");
		String dod=req.getParameter("dod");
		
		
		System.out.println(name);
		System.out.println(region);
		System.out.println(noOfQueens);
		System.out.println(dob);
		System.out.println(dod);

		
		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:red';>");
		writer.print("series name"+name+"is sent success");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		
		resp.setContentType("text/html");
	}
	
	@Override
	public void destroy() {
		System.out.println("running destroy in king....");
	}

}


