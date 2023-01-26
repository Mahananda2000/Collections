package com.xworkz.resumeServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1, urlPatterns="/resume")
public class ResumeServlet extends HttpServlet {
	
	public ResumeServlet() {
      System.out.println("creating resume...");	
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("initi configu...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     System.out.println("running doGet in resume...");
		
		String name=req.getParameter("studentname");
		String middleName=req.getParameter("middlename");
		String lastName=req.getParameter("lastname");
		String dob=req.getParameter("dob");
		String gender=req.getParameter("gender");
		String age=req.getParameter("age");
		String education=req.getParameter("education");
		String percentage=req.getParameter("percentage");
		String hobbies=req.getParameter("hobbies");
		String skills=req.getParameter("skills");
		
		String resumeType=req.getParameter("resumetype");
		String gmail=req.getParameter("gmail");
		String contactNo=req.getParameter("contactnumber");
		String language=req.getParameter("language");
		String college=req.getParameter("college");
		String highestGraduation=req.getParameter("highestgraduation");
		String cgpa=req.getParameter("cgpa");
		String sgpa=req.getParameter("sgpa");
		String alive=req.getParameter("alive");
		String signature=req.getParameter("signature");
		
		
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(lastName);
		System.out.println(dob);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(education);
		System.out.println(percentage);
		System.out.println(hobbies);
		System.out.println(skills);
		System.out.println(resumeType);
		System.out.println(gmail);
		System.out.println(contactNo);
		System.out.println(language);
		System.out.println(college);
		System.out.println(highestGraduation);
		System.out.println(cgpa);
		System.out.println(sgpa);
		System.out.println(alive);
		System.out.println(signature);

		
		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:green';>");
		writer.print("Resume name"+name+"is sent success");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		
		resp.setContentType("text/html");
	}

	@Override
	public void destroy() {
		System.out.println("running destroy in resume....");
	}

}
