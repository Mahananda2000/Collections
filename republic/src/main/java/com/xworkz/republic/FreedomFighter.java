package com.xworkz.republic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup=1,urlPatterns="/freedom")
public class FreedomFighter extends HttpServlet {
	

		public FreedomFighter() {
			System.out.println("creating freedom fighter...");
		}
		
		
		@Override
		public void init(ServletConfig config) throws ServletException {
		  System.out.println("running init ......config");
		}
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("running doGet in FreedomServlet..");
			
			
			
			String name=req.getParameter("fightername");
			String alive=req.getParameter("alive");
			String mode=req.getParameter("mode");
			String weapon=req.getParameter("weapon");
			
			System.out.println(name);
			System.out.println(alive);
			System.out.println(mode);
			System.out.println(weapon);
			
			PrintWriter writter=resp.getWriter();
			writter.print("<html>");
			writter.print("<body>");
			writter.print("<h1>");
			writter.print("<span style='color:blue;'>");
            writter.print("Fighter Name"+name+"is sent success");
            writter.print("</span>");
			writter.print("</h1>");
			writter.print("</body>");
			writter.print("</html>");
			
			resp.setContentType("text/html");
		
		}
		
		@Override
		public void destroy() {
		 System.out.println("running destroy in freedom fighter....");
		}
		
		
		
	}


