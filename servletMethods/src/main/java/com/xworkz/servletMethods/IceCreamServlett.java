package com.xworkz.servletMethods;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1,urlPatterns="/ice")
public class IceCreamServlett extends HttpServlet {
	
	public IceCreamServlett() {
		System.out.println("Created IceCream...");
	}
	
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    System.out.println("display data as doGet...");
		String data="Straberry flavour,cornetto";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		System.out.println("display data as doPost...");
		String data="Straberry flavour,cornetto";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("display data as doPut...");
		String data="Straberry flavour,cornetto";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	private void destoy() {
		System.out.println("display data as destoy...");
	}
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("display data as doOption...");
		String data="Straberry flavour,cornetto";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
		
	}
	
	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("display data as doTrace...");
		String data="Straberry flavour,cornetto";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");

	}
	
     @Override
     public void init(ServletConfig config) throws ServletException {
	    System.out.println("init data from icecream..");
}

}

