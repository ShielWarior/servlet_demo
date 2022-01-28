package com.servlet_00;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1  extends HttpServlet{
	
		public void service(HttpServletRequest req ,HttpServletResponse res) throws IOException
		{
			int i=Integer.parseInt(req.getParameter("num1"));
			int j=Integer.parseInt(req.getParameter("num2"));
			int k=i+j;
			System.out.println("add :-"+k);
			PrintWriter out=res.getWriter();
			
			out.println("Addition is "+k);
			
		}
	

}