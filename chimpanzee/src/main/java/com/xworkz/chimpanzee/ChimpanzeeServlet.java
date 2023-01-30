package com.xworkz.chimpanzee;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1,name="ChimpanzeeServlet",urlPatterns="/touch")
public class ChimpanzeeServlet extends HttpServlet {
	
	public ChimpanzeeServlet() {
		System.out.println("creating chimpanzeeServlet...");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost in ChimpanzeeServlet...");
		
		String firstName=req.getParameter("fName");
		String lastName=req.getParameter("lName");
		String email=req.getParameter("email");
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("Show.jsp");
		req.setAttribute("fName",firstName);
		req.setAttribute("lName",lastName);
		req.setAttribute("email",email);
		String temp="yen madta idiya....";
		System.out.println("Displaying in jsp: "+temp);
		req.setAttribute("torisu", temp);
		dispatcher.forward(req, resp);
		
	}
}
