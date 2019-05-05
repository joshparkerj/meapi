package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = -2347170500733541332L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String name;
		String greeting;
		name = req.getParameter("name");
		greeting = this.getServletContext().getInitParameter("greeting");
		if (name != null)
			session.setAttribute("name", name);
		else {
			name = (String) session.getAttribute("name");
			if (name == null)
				name = this.getInitParameter("name");
		}
		PrintWriter out = res.getWriter();
		out.println("<h1>" + greeting + "</h1>");
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
