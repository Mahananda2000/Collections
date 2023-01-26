package com.xworkz.serials;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup=1, urlPatterns="/web")
public class WebSeries extends HttpServlet {
	
	public WebSeries() {
		System.out.println("creating webseries....");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running init..config");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet in webseries...");
		
		String name=req.getParameter("seriesname");
		String langauge=req.getParameter("language");
		String episodes=req.getParameter("episodes");
		String ott=req.getParameter("ott");
		String budget=req.getParameter("budget");
		
		
		System.out.println(name);
		System.out.println(langauge);
		System.out.println(episodes);
		System.out.println(ott);
		System.out.println(budget);

		
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
		System.out.println("running destroy in webseries....");
	}

}

