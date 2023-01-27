package com.xworkz.webproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=2,urlPatterns="/lock")

public class Location extends HttpServlet {
	
	public Location() {
		System.out.println("creating location...");
	}

	
	@Override
	public void init() throws ServletException {
		System.out.println("running init config...");
	}
	
	@Override
	protected void doGet
	
	(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet in servlet.....");
		
		String name=req.getParameter("locationName");
		String email=req.getParameter("email");
		String startPoint=req.getParameter("startPoint");
		String destination=req.getParameter("destination");
		String gender=req.getParameter("gender");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(startPoint);
		System.out.println(destination);
		System.out.println(gender);
		
		
		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		
		if(name.length()>3) {
		writer.print("<span style='color:blue;'>");
		writer.print("successfully send"+" "+name);
		
		}else {
			writer.print("<span style='color:green;'>");
			writer.print("failure"+" "+name);	
		}
		writer.print("<pre>");
		writer.print("<a href='location.html'>sign up agin</a>");
		writer.print("</pre>");
		writer.print("<pre>");
		writer.print("<a href='index.html'>Home page</a>");
		writer.print("</pre>");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		
		
		resp.setContentType("text/html");
		
	}
}
